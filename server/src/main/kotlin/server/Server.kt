package server

import common.GlobalAppSettings
import common.MazeInfo
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.serialization.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.util.pipeline.*
import server.mazes.createMazes
import java.util.*

fun main() {
    embeddedServer(Netty, GlobalAppSettings.port) {

        install(ContentNegotiation) {
            json()
        }
        install(CORS) {
            method(HttpMethod.Get)
            method(HttpMethod.Post)
            method(HttpMethod.Delete)
            anyHost()
        }
        install(Compression) {
            gzip()
        }
        routing {
            get("/") {
                call.respondText("Hello there, what an aMAZEing day.", ContentType.Text.Plain)
            }
            route("/maze") {
                get("/{id}") {
                    try {
                        val id = getMazeIdFromCall()
                        val maze = mazes[id]
                        if (maze != null) {
                            if (maze.player.Statistics().checkStamina()) {
                                call.respond(
                                    MazeInfo(
                                        maze.currentPosition(),
                                        maze.allowedDirections(),
                                        maze.info(),
                                        maze.player.Inventory().getInventory(),
                                        maze.endOfMaze(),
                                        maze.neededItems()
                                    )
                                )
                            } else {
                                call.respond(
                                    MazeInfo(
                                        null,
                                        setOf(),
                                        "Je hebt geen energie meer om door te gaan",
                                        emptyList(),
                                        true
                                    )
                                )
                            }
                        } else {
                            call.respond(MazeInfo(null, setOf(), "Onbekend level"))
                        }
                    } catch (error: IllegalStateException) {
                        call.respond(MazeInfo(null, setOf(), error.message ?: "Onbekende fout opgetreden"))
                    }
                }
                post("/{id}/move") {
                    val id = getMazeIdFromCall()
                    val maze = mazes[id]
                    if (maze?.move(call.receive()) == true) {
                        call.respond(true)
                    } else {
                        call.respond(false)
                    }
                }
                post("/{id}/use/{item}") {
                    val id = getMazeIdFromCall()
                    val item = getParameterFromCall("item")
                    val maze = mazes[id]
                    if (maze?.useItem(item) == true) {
                        call.respond(true)
                    } else {
                        call.respond(false)
                    }
                }
                post("/{id}/solve/{input}") {
                    val id = getMazeIdFromCall()
                    val input = getParameterFromCall("input")
                    val maze = mazes[id]
                    if (maze?.solve(input) == true) {
                        call.respond(true)
                    } else {
                        call.respond(false)
                    }
                }
                delete("/{id}") {
                    val id = getMazeIdFromCall()
                    val maze = mazes[id]
                    maze?.reset()
                    call.respond(HttpStatusCode.OK)
                }
            }
        }
    }.start(wait = true)
}

private fun PipelineContext<Unit, ApplicationCall>.getMazeIdFromCall(): UUID {
    return try {
        UUID.fromString(call.parameters["id"] ?: error("No maze id given (it's a UUID)."))
    } catch (ex: IllegalArgumentException) {
        error("'${call.parameters["id"]}' Is not a valid ID. Last known correct mazeId is $lastMazeId")
    }
}

private fun PipelineContext<Unit, ApplicationCall>.getParameterFromCall(parameter: String): String {
    return call.parameters[parameter] ?: error("No parameter $parameter given.")
}

private val lastMazeId = UUID.fromString("94e2254e-5c5d-4395-b807-8ac3d713e1b3")

private val mazes = createMazes().associateBy { m -> m.mazeId }
