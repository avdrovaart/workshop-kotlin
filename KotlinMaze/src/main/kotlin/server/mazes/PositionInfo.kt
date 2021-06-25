package server.mazes

import common.Direction
import common.Position

data class PositionInfo(val position: Position, val allowedDirections: List<Direction>, val info: String)
