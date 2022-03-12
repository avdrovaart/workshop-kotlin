package server.model

import common.Direction

class SolvedPuzzle : Puzzle {
    override fun isSolved(): Boolean {
        return true
    }

    override fun solve(input: String): Boolean {
        return false
    }

    override fun reset() {

    }

    override fun needInventoryItem(): Boolean {
        return false
    }

    override fun hasPuzzleInfo(): Boolean {
        return false
    }

    override fun puzzleInfo(): String {
        return ""
    }

    override fun neededItems(): Set<String> {
        return emptySet()
    }

    override fun puzzleDirections(): Set<Direction> {
        return emptySet()
    }
}