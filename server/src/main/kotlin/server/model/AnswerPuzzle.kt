package server.model

import common.Direction

class AnswerPuzzle(
    private val directions: Set<Direction>,
    private val expectedAnswer: String,
    private val infoUnsolved: String,
    private val infoSolved: String
) : Puzzle {
    private var correctAnswerReceived = false


    override fun isSolved(): Boolean {
        return correctAnswerReceived
    }

    override fun solve(input: String): Boolean {
        if (!correctAnswerReceived && expectedAnswer == input) {
            correctAnswerReceived = true
        }
        return correctAnswerReceived
    }

    override fun reset() {
        correctAnswerReceived = false
    }

    override fun needInventoryItem(): Boolean {
        return false
    }

    override fun hasPuzzleInfo(): Boolean {
        return true
    }

    override fun puzzleInfo(): String {
        return if (correctAnswerReceived) infoSolved else infoUnsolved
    }

    override fun neededItems(): Set<String> {
        return emptySet()
    }

    override fun puzzleDirections(): Set<Direction> {
        return directions
    }
}