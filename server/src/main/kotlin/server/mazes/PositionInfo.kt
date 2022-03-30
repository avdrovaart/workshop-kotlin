package server.mazes

import common.Direction
import common.Position
import server.MoveOffsetInfo

data class PositionInfo(
    val position: Position,
    val allowedDirections: List<Direction>,
    val info: String,
    val endOfMaze: Boolean = false,
    val offsets: Map<Direction, MoveOffsetInfo> = emptyMap()
)
