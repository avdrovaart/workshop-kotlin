package client

import common.Direction
import common.MazeInfo

private const val MAZE_ID_LEVEL1 = "94e2254e-5c5d-4395-b807-8ac3d713e1b3"
private const val MAZE_ID_LEVEL2 = "6bec1ac2-ad66-4a9e-aff7-52581d1008e7"

fun main() {
    val mazeId = MAZE_ID_LEVEL1
    maze1(mazeId);
//    val mazeId = MAZE_ID_LEVEL2
//    maze2(mazeId);
    printInfo(ApiSync.getCurrentPosition(mazeId))
}

fun moveAmountOfSteps(amountOfSteps: Int, direction: Direction, mazeId: String) {
    for(i in 1..amountOfSteps) {
        var info = ApiSync.getCurrentPosition(mazeId)
        if(info.allowedDirections.contains(direction)) {
            ApiSync.move(mazeId, direction)
            info = ApiSync.getCurrentPosition(mazeId)
        } else {
            break
        }
    }
}

fun maze2(mazeId: String) {
    ApiSync.move(mazeId, Direction.TOP)
}

fun maze1(mazeId: String) {
    ApiSync.resetMaze(mazeId)
    ApiSync.move(mazeId, Direction.TOP)
    for(i in 1..4) {
        ApiSync.move(mazeId, Direction.RIGHT)
    }
    moveAmountOfSteps(6, Direction.TOP, mazeId)
//    moveAmountOfSteps(13, Direction.LEFT, mazeId)
    moveAmountOfSteps(18, Direction.RIGHT, mazeId)
}

fun printInfo(info: MazeInfo) {
    println("=============================================================================")
    println("Huidige positie: ${info.position}")
    println("Toegestane richtingen: ${info.allowedDirections}")
    println("Einde level: ${info.endOfMaze}")
    println("Extra info: ${info.text}")
    println("=============================================================================")
}
