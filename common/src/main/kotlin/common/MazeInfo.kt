package common

import kotlinx.serialization.Serializable

@Serializable
data class MazeInfo(
    val position: Position?,
    val allowedDirections: Set<Direction>,
    val text: String,
    val inventory: List<String> = emptyList(),
    val endOfMaze: Boolean = false,
    val neededItems: Set<String> = emptySet()
)
