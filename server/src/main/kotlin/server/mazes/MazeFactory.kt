package server.mazes

fun createMazes(): List<Maze> {
    val mazes = mutableListOf<Maze>()
    mazes.add(Maze01())
    mazes.add(Maze02())
    mazes.add(MazeLoop())
    mazes.forEach(Maze::reset)
    return mazes
}
