package common

import kotlinx.serialization.Serializable

@Serializable
enum class Direction(val x: Int, val y: Int) {
    NORTH(0, 1), SOUTH(0, -1), WEST(-1, 0), EAST(1, 0)
}