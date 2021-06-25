package server.mazes

import common.Direction
import common.Position
import java.util.*

class Maze(val mazeId: UUID, val startPosition: Position, positionInfos: List<PositionInfo>) {
    private var currentPosition: Position = startPosition
    private val positions: Map<Position, PositionInfo> = positionInfos.associateBy { p -> p.position }

    fun reset() {
        currentPosition = startPosition
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
        return positions[currentPosition]?.info ?: "I don't know where I am. You should probably reset this level."
    }
}