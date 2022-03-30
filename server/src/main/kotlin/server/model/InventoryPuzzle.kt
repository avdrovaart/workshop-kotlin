package server.model

import common.Direction

class InventoryPuzzle(private val directions: Set<Direction>, vararg itemsNeeded: String) : Puzzle {
    private val itemsNeeded: Set<String>
    private val itemsReceived = mutableSetOf<String>()

    init {
        this.itemsNeeded = itemsNeeded.asList().toHashSet()
    }

    override fun isSolved(): Boolean {
        return itemsReceived.containsAll(itemsNeeded)
    }

    override fun solve(input: String): Boolean {
        if (itemsNeeded.contains(input)) {
            return itemsReceived.add(input)
        }
        return false
    }

    override fun reset() {
        itemsReceived.clear()
    }

    override fun needInventoryItem(): Boolean {
        return true
    }

    override fun hasPuzzleInfo(): Boolean {
        return true
    }

    override fun puzzleInfo(): String {
        val sb = StringBuilder("De volgende items zijn nodig:\n")
        itemsNeeded.forEach { i -> sb.append("  $i: " + (if (itemsReceived.contains(i)) "ontvangen" else "nog nodig") + "\n") }
        return sb.toString()
    }

    override fun neededItems(): Set<String> {
        return itemsNeeded.subtract(itemsReceived)
    }

    override fun puzzleDirections(): Set<Direction> {
        return directions
    }
}