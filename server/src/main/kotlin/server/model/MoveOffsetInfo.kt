package server.model

import common.Direction
import common.Position

data class MoveOffsetInfo(val x: Int = 0, val y: Int = 0, val text: String) {
    fun move(direction: Direction, position: Position): Position {
        return Position(direction.x + position.x + x, direction.y + position.y + y)
    }
}