package common

import kotlinx.serialization.Serializable

@Serializable
data class MazeInfo(val position: Position?, val text: String?)
