package server.mazes

import common.Direction
import common.Position
import server.player.Player
import java.util.*

abstract class Maze(val mazeId: UUID, val startPosition: Position, val player: Player) {
    private val positionInfos = mutableListOf<PositionInfo>()
    private var currentPosition: Position = startPosition
    private val positions = mutableMapOf<Position, PositionInfo>()

    fun reset() {
        currentPosition = startPosition
        positionInfos.clear()
        positionInfos.addAll(generateMaze())
        positions.clear()
        positions.putAll(positionInfos.associateBy { p -> p.position })
        player.reset()
    }

    fun move(direction: Direction): Boolean {
        val positionInfo: PositionInfo = positions[currentPosition] ?: return false
        if (positionInfo.allowedDirections.contains(direction)) {
            currentPosition = currentPosition.move(direction)
            return true
        }
        return false
    }

    fun currentPosition(): Position {
        return currentPosition
    }

    fun info(): String {
        return positions[currentPosition]?.info
                ?: "Je bent op een vreemde plek beland. Het is beter om de puzzel te resetten want hier kom je niet meer weg."
    }

    fun allowedDirections(): List<Direction> {
        return positions[currentPosition]?.allowedDirections ?: listOf()
    }

    fun endOfMaze(): Boolean {
        return positions[currentPosition]?.endOfMaze ?: false
    }

    abstract fun generateMaze(): List<PositionInfo>
}
