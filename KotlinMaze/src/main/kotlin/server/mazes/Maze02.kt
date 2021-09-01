package server.mazes

import common.Direction
import common.Position
import java.util.*


fun generateMaze02(): Maze {
    val infos = mutableListOf<PositionInfo>()
    infos.add(PositionInfo( //start
            Position(0, 0), listOf(Direction.TOP),
            """
            TODO
        """.trimIndent()
    ))

    return Maze(UUID.fromString("6bec1ac2-ad66-4a9e-aff7-52581d1008e7"), common.Position(0, 0), infos);
}


