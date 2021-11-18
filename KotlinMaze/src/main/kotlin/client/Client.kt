package client

import common.Direction
import common.MazeInfo

private const val MAZE_ID_LEVEL1 = "94e2254e-5c5d-4395-b807-8ac3d713e1b3"

fun main() {
    val mazeId = MAZE_ID_LEVEL1
    ApiSync.resetMaze(mazeId)
    printInfo(ApiSync.getCurrentPosition(mazeId))
    //TODO: some aMAZEing magic
}

fun printInfo(info: MazeInfo) {
    println("=============================================================================")
    println("Huidige positie: ${info.position}")
    println("Extra info: ${info.text}")
    println("=============================================================================")
}
