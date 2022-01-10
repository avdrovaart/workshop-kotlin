package common

import kotlinx.serialization.Serializable

@Serializable
data class Move(val direction: Direction)
