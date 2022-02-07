package server

import common.Position

data class MoveOffsetInfo(val x: Int, val y: Int, val text: String) {
    fun move(position: Position): Position {
        return Position(position.x + x, position.y + y)
    }
}