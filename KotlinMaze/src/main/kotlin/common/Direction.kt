package common

import kotlinx.serialization.Serializable

@Serializable
enum class Direction(val x: Int, val y: Int) {
    TOP(0, 1), BOTTOM(0, -1), LEFT(-1, 0), RIGHT(1, 0)
}