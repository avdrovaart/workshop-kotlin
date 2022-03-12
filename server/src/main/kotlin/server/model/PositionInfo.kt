package server.model

import common.Direction
import common.Position

data class PositionInfo(
    val position: Position,
    private val allowedDirections: Set<Direction>,
    val info: String,
    val endOfMaze: Boolean = false,
    val offsets: Map<Direction, MoveOffsetInfo> = emptyMap(),
    val items: Set<String> = setOf(),
    val puzzle: Puzzle = SolvedPuzzle()
) {

    fun allowedDirections(): Set<Direction> {
        if (puzzle.isSolved()) {
            return allowedDirections.plus(puzzle.puzzleDirections())
        }
        return allowedDirections
    }
}
