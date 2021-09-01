package server.mazes

fun createMazes(): List<Maze> {
    val mazes = mutableListOf<Maze>()
    mazes.add(generateMaze01())
    mazes.add(generateMaze02())
    return mazes
}
