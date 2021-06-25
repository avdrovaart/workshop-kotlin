package server.mazes

import common.Direction
import common.Position
import java.util.*

fun createMazes(): List<Maze> {
    val mazes = mutableListOf<Maze>()
    mazes.add(createMaze1())
    return mazes
}

fun createMaze1(): Maze {
    val info0 = PositionInfo(
        Position(0, 0), listOf(Direction.TOP),
        """
            Welkom het is gelukt om de server te starten en de client er mee te laten praten. 
            Dit is het eerste level. Om naar de uitgang te komen moet je in dit level naar boven verplaatsen.
            Dit kan je doen door aan de client een regel toe te voegen die de server aanspoort om je te verplaatsen.
            Voor het gemak: ApiSync.move(mazeId, Direction.TOP)
            Vervolgens wil je de info weten van de positie waar je bent dus vraag je die op: ApiSync.getCurrentPosition(mazeId)
            En vergeet niet om de informatie van de nieuwe positie te printen naar de console via de printInfo functie.
        """.trimIndent()
    )
    val info1 = PositionInfo(
        Position(0, 1), listOf(Direction.BOTTOM),
        """
            Gefeliciteerd!! Je bent verplaatst naar het volgende veld. Dit is het einde van het eerste maze.
            Het ID van het volgende level is: 
        """.trimIndent()
    )
    val infos = listOf(info0, info1)
    return Maze(UUID.fromString("94e2254e-5c5d-4395-b807-8ac3d713e1b3"), Position(0, 0), infos)
}
