package server.model

import common.Direction

interface Puzzle {
    fun isSolved(): Boolean

    fun solve(input: String): Boolean

    fun reset()

    fun needInventoryItem(): Boolean

    fun hasPuzzleInfo(): Boolean

    fun puzzleInfo(): String

    fun neededItems(): Set<String>

    fun puzzleDirections(): Set<Direction>
}
