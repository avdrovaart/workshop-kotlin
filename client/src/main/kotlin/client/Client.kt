package client

import common.MazeInfo

private const val MAZE_ID_LEVEL1 = "1be61571-828f-4a18-b318-54cabac31412"

fun main() {
    val mazeId = MAZE_ID_LEVEL1
    ApiSync.resetMaze(mazeId)
    printInfo(ApiSync.getCurrentPosition(mazeId))
    //TODO: some aMAZEing magic
}

fun printInfo(info: MazeInfo) {
    println("=============================================================================")
    println("Huidige positie: ${info.position}")
    println("Toegestane richtingen: ${info.allowedDirections}")
    println("Inventory: ${info.inventory}")
    println("Benodigde items: ${info.neededItems}")
    println("Text: ${info.text}")
    println("=============================================================================")
}
