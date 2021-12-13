package client

import common.Direction
import common.MazeInfo
import common.GlobalAppSettings
import io.ktor.http.*
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import kotlinx.coroutines.runBlocking


class ApiSync {
    companion object {
        fun getCurrentPosition(mazeId: String): MazeInfo {
            return runBlocking { ApiAsync.getCurrentPosition(mazeId) }
        }

        fun move(mazeId: String, direction: Direction): Boolean {
            return runBlocking { ApiAsync.move(mazeId, direction) }
        }

        fun resetMaze(mazeId: String) {
            runBlocking { ApiAsync.resetMaze(mazeId) }
        }
    }
}

class ApiAsync {
    companion object {
        private const val endpoint = "http://${GlobalAppSettings.host}:${GlobalAppSettings.port}/maze"
        private val jsonClient = HttpClient { install(JsonFeature) { serializer = KotlinxSerializer() } }

        suspend fun getCurrentPosition(mazeId: String): MazeInfo {
            return jsonClient.get("$endpoint/$mazeId")
        }

        suspend fun move(mazeId: String, direction: Direction): Boolean {
            return jsonClient.post("$endpoint/$mazeId/move") {
                contentType(ContentType.Application.Json)
                body = direction
            }
        }

        suspend fun resetMaze(mazeId: String) {
            jsonClient.delete<Unit>("$endpoint/$mazeId")
        }
    }
}