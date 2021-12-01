package common

import kotlinx.serialization.Serializable

@Serializable
data class Position(val x: Int, val y: Int) {
    fun move(direction: Direction): Position {
        return Position(x + direction.x, y + direction.y)
    }
}
