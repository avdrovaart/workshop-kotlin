package server.mazes

import common.Direction
import common.Position
import server.model.Player
import server.model.PositionInfo
import server.model.Puzzle
import java.util.*

abstract class Maze(val mazeId: UUID, val startPosition: Position, val player: Player) {
    private val positionInfos = mutableListOf<PositionInfo>()
    private var currentPosition: Position = startPosition
    private val positions = mutableMapOf<Position, PositionInfo>()
    private val items = mutableMapOf<Position, MutableSet<String>>()
    private val puzzles = mutableMapOf<Position, Puzzle>()
    private var extraInfo = ""

    fun reset() {
        currentPosition = startPosition
        positionInfos.clear()
        positionInfos.addAll(generateMaze())
        positions.clear()
        positions.putAll(positionInfos.associateBy { p -> p.position })
        items.putAll(positionInfos.associateBy({ p -> p.position }, { p -> p.items.toMutableSet() }))
        puzzles.putAll(positionInfos.associateBy({ p -> p.position }, { p -> p.puzzle }))
        puzzles.values.forEach(Puzzle::reset)
        player.reset()
    }

    fun move(direction: Direction): Boolean {
        val positionInfo: PositionInfo = positions[currentPosition] ?: return false
        if (player.Statistics().checkStamina() && positionInfo.allowedDirections().contains(direction)) {
            player.Statistics().decrementStamina()
            val moveOffsetInfo = positionInfo.offsets[direction]
            if (moveOffsetInfo != null) {
                currentPosition = moveOffsetInfo.move(direction, currentPosition)
                extraInfo = moveOffsetInfo.text
            } else {
                currentPosition = currentPosition.move(direction)
                extraInfo = ""
            }
            // pickup inventory items
            val posItems = items[currentPosition]
            if (posItems != null && posItems.isNotEmpty()) {
                player.Inventory().addItems(posItems)
                posItems.clear()
            }
            return true
        }
        return false
    }

    fun currentPosition(): Position {
        return currentPosition
    }

    fun info(): String {
        val info = positions[currentPosition]
        if (info != null) {
            var result = info.info
            if (extraInfo.isNotEmpty()) {
                result = extraInfo + "\n" + result
            }
            val puzzle = puzzles[currentPosition]
            if (puzzle != null && puzzle.hasPuzzleInfo()) {
                result += "\n" + puzzle.puzzleInfo()
            }
            return result
        }
        return "Je bent op een vreemde plek beland. Het is beter om de puzzel te resetten want hier kom je niet meer weg."
    }

    fun allowedDirections(): Set<Direction> {
        return positions[currentPosition]?.allowedDirections() ?: setOf()
    }

    fun endOfMaze(): Boolean {
        return positions[currentPosition]?.endOfMaze ?: false
    }

    fun neededItems(): Set<String> {
        return puzzles[currentPosition]?.neededItems() ?: setOf()
    }

    fun useItem(item: String): Boolean {
        val currentPuzzle = puzzles[currentPosition]
        if (player.Inventory().checkInventory(item) &&
            currentPuzzle != null &&
            currentPuzzle.needInventoryItem() &&
            currentPuzzle.solve(item)
        ) {
            player.Inventory().removeItem(item)
            return true
        }
        return false
    }

    fun solve(input: String): Boolean {
        val currentPuzzle = puzzles[currentPosition]
        if (currentPuzzle != null &&
            !currentPuzzle.needInventoryItem() &&
            currentPuzzle.solve(input)
        ) {
            return true
        }
        return false
    }

    abstract fun generateMaze(): List<PositionInfo>
}
