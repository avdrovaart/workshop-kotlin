package server.mazes

import common.Direction
import common.Position
import server.player.Player
import java.util.*

abstract class Maze(val mazeId: UUID, val startPosition: Position, val player: Player) {
    private val positionInfos = mutableListOf<PositionInfo>()
    private var currentPosition: Position = startPosition
    private val positions = mutableMapOf<Position, PositionInfo>()
    private var extraInfo = ""

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
            val moveOffsetInfo = positionInfo.offsets[direction]
            if (moveOffsetInfo != null) {
                currentPosition = moveOffsetInfo.move(direction, currentPosition)
                extraInfo = moveOffsetInfo.text
            } else {
                currentPosition = currentPosition.move(direction)
                extraInfo = ""
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
            if (extraInfo == "") {
                return info.info
            }
            return extraInfo + "\n" + info.info
        }
        return "Je bent op een vreemde plek beland. Het is beter om de puzzel te resetten want hier kom je niet meer weg."
    }

    fun allowedDirections(): List<Direction> {
        return positions[currentPosition]?.allowedDirections ?: listOf()
    }

    fun endOfMaze(): Boolean {
        return positions[currentPosition]?.endOfMaze ?: false
    }

    abstract fun generateMaze(): List<PositionInfo>
}
