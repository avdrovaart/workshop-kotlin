package server.mazes

import common.Direction
import common.Position
import server.player.Player
import java.util.*


class Maze02 : Maze(UUID.fromString("6bec1ac2-ad66-4a9e-aff7-52581d1008e7"), common.Position(0, 0), Player(10)) {
    override fun generateMaze(): List<PositionInfo> {
        val infos = mutableListOf<PositionInfo>()
        infos.add(PositionInfo( //start
                Position(0, 0), listOf(Direction.TOP),
                """
            TODO
        """.trimIndent()
        ))
        return infos
    }
}



