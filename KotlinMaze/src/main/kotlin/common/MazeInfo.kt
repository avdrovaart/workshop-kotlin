package common

import kotlinx.serialization.Serializable

@Serializable
data class MazeInfo(val position: Position?, val allowedDirections: List<Direction>?, val text: String?)
