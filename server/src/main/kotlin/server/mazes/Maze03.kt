package server.mazes

import common.Direction
import common.Position
import server.model.Player
import server.model.PositionInfo
import java.util.*


class Maze03 : Maze(UUID.fromString("264cc5b8-b00c-11ec-b909-0242ac120002"), Position(7, 0), Player(53)) {
    override fun generateMaze(): List<PositionInfo> {
        val infos = mutableListOf<PositionInfo>()
        // START
        infos.add(PositionInfo(Position(7, 0), setOf(Direction.TOP),
            ("Welkom in je derde maze. In dit level zijn meerdere routes mogelijk, echter, niet alle routes zijn haalbaar " +
                    "met de hoeveelheid stamina die je hebt. Kies je route wijzelijk!")
        ))

        // X = 0
        infos.add(PositionInfo(Position(0, 9), setOf(Direction.RIGHT, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(0, 10), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(0, 11), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(0, 12), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(0, 13), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(0, 14), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(0, 15), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(0, 16), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(0, 17), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(0, 18), setOf(Direction.BOTTOM, Direction.RIGHT), ("Stap gezet.")))

        // X = 1
        infos.add(PositionInfo(Position(1, 9), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(1, 18), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))

        // X = 2
        infos.add(PositionInfo(Position(2, 1), setOf(Direction.TOP, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(2, 2), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(2, 3), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(2, 4), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(2, 5), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(2, 6), setOf(Direction.RIGHT, Direction.BOTTOM), ("Stap gezet.")))

        infos.add(PositionInfo(Position(2, 9), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(2, 11), setOf(Direction.TOP, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(2, 12), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(2, 13), setOf(Direction.BOTTOM, Direction.RIGHT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(2, 15), setOf(Direction.TOP, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(2, 16), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(2, 17), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(2, 18), setOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(2, 19), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(2, 20), setOf(Direction.BOTTOM, Direction.RIGHT), ("Stap gezet.")))

        // X = 3
        infos.add(PositionInfo(Position(3, 1), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(3, 6), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(3, 9), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(3, 11), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(3, 13), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(3, 15), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(3, 20), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))

        // X = 4
        infos.add(PositionInfo(Position(4, 1), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(4, 6), setOf(Direction.LEFT, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(4, 7), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(4, 8), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(4, 9), setOf(Direction.LEFT, Direction.BOTTOM), ("Stap gezet.")))

        infos.add(PositionInfo(Position(4, 11), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(4, 13), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(4, 15), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(4, 17), setOf(Direction.TOP, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(4, 18), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(4, 19), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(4, 20), setOf(Direction.LEFT, Direction.BOTTOM), ("Stap gezet.")))

        // X = 5
        infos.add(PositionInfo(Position(5, 1), setOf(Direction.LEFT, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(5, 2), setOf(Direction.BOTTOM, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(5, 3), setOf(Direction.RIGHT, Direction.BOTTOM), ("Stap gezet.")))

        infos.add(PositionInfo(Position(5, 11), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(5, 13), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(5, 15), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(5, 17), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))

        // X = 6
        infos.add(PositionInfo(Position(6, 3), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(6, 11), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(6, 13), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(6, 15), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(6, 17), setOf(Direction.TOP, Direction.LEFT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(6, 18), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(6, 19), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(6, 20), setOf(Direction.BOTTOM, Direction.RIGHT), ("Stap gezet.")))

        // X = 7
        infos.add(PositionInfo(Position(7, 1), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(7, 2), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(7, 3), setOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(7, 4), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(7, 5), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(7, 6), setOf(Direction.TOP, Direction.BOTTOM, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(7, 7), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(7, 8), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(7, 9), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(7, 10), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(7, 11), setOf(Direction.LEFT, Direction.BOTTOM), ("Stap gezet.")))

        infos.add(PositionInfo(Position(7, 13), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(7, 15), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(7, 20), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))

        // X = 8
        infos.add(PositionInfo(Position(8, 6), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(8, 13), setOf(Direction.LEFT, Direction.RIGHT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(8, 15), setOf(Direction.LEFT, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(8, 16), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(8, 17), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(8, 18), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(8, 19), setOf(Direction.TOP, Direction.BOTTOM, Direction.RIGHT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(8, 20), setOf(Direction.TOP, Direction.LEFT), ("Stap gezet.")))

        // X = 9
        infos.add(PositionInfo(Position(9, 1), setOf(Direction.RIGHT, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(9, 2), setOf(Direction.BOTTOM, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(9, 3), setOf(Direction.BOTTOM, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(9, 4), setOf(Direction.BOTTOM, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(9, 5), setOf(Direction.BOTTOM, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(9, 6), setOf(Direction.BOTTOM, Direction.LEFT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(9, 9), setOf(Direction.RIGHT, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(9, 10), setOf(Direction.BOTTOM, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(9, 11), setOf(Direction.BOTTOM, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(9, 12), setOf(Direction.BOTTOM, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(9, 13), setOf(Direction.BOTTOM, Direction.LEFT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(9, 19), setOf(Direction.RIGHT, Direction.LEFT), ("Stap gezet.")))

        // X = 10
        infos.add(PositionInfo(Position(10, 1), setOf(Direction.RIGHT, Direction.LEFT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(10, 9), setOf(Direction.RIGHT, Direction.LEFT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(10, 19), setOf(Direction.RIGHT, Direction.LEFT), ("Stap gezet.")))

        // X = 11
        infos.add(PositionInfo(Position(11, 1), setOf(Direction.RIGHT, Direction.LEFT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(11, 4), setOf(Direction.RIGHT, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(11, 5), setOf(Direction.BOTTOM, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(11, 6), setOf(Direction.BOTTOM, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(11, 7), setOf(Direction.BOTTOM, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(11, 8), setOf(Direction.BOTTOM, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(11, 9), setOf(Direction.RIGHT, Direction.LEFT, Direction.BOTTOM), ("Stap gezet.")))

        infos.add(PositionInfo(Position(11, 12), setOf(Direction.RIGHT, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(11, 13), setOf(Direction.BOTTOM, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(11, 14), setOf(Direction.BOTTOM, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(11, 15), setOf(Direction.BOTTOM, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(11, 16), setOf(Direction.BOTTOM, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(11, 17), setOf(Direction.BOTTOM, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(11, 18), setOf(Direction.BOTTOM, Direction.TOP), ("Stap gezet.")))
        infos.add(PositionInfo(Position(11, 19), setOf(Direction.BOTTOM, Direction.TOP, Direction.LEFT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(11, 20), setOf(Direction.BOTTOM, Direction.TOP), ("Stap gezet.")))
        infos.add(
            PositionInfo(Position(11, 21), setOf(Direction.BOTTOM), ("Einde. Code voor het volgende level is: ..."), true
        ))

        // X = 12
        infos.add(PositionInfo(Position(12, 1), setOf(Direction.RIGHT, Direction.LEFT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(12, 4), setOf(Direction.RIGHT, Direction.LEFT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(12, 9), setOf(Direction.RIGHT, Direction.LEFT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(12, 12), setOf(Direction.RIGHT, Direction.LEFT), ("Stap gezet.")))

        // X = 13
        infos.add(PositionInfo(Position(13, 1), setOf(Direction.RIGHT, Direction.LEFT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(13, 4), setOf(Direction.TOP, Direction.LEFT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(13, 5), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(13, 6), setOf(Direction.BOTTOM, Direction.RIGHT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(13, 9), setOf(Direction.RIGHT, Direction.LEFT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(13, 12), setOf(Direction.TOP, Direction.LEFT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(13, 13), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(13, 14), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(13, 15), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(13, 16), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(13, 17), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(13, 18), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(13, 19), setOf(Direction.BOTTOM, Direction.RIGHT), ("Stap gezet.")))

        // X = 14
        infos.add(PositionInfo(Position(14, 1), setOf(Direction.RIGHT, Direction.LEFT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(14, 6), setOf(Direction.RIGHT, Direction.LEFT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(14, 9), setOf(Direction.RIGHT, Direction.LEFT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(14, 19), setOf(Direction.RIGHT, Direction.LEFT), ("Stap gezet.")))

        // X = 15
        infos.add(PositionInfo(Position(15, 1), setOf(Direction.RIGHT, Direction.LEFT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(15, 6), setOf(Direction.RIGHT, Direction.LEFT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(15, 9), setOf(Direction.RIGHT, Direction.LEFT), ("Stap gezet.")))

        infos.add(PositionInfo(Position(15, 19), setOf(Direction.RIGHT, Direction.LEFT), ("Stap gezet.")))

        // X = 16
        infos.add(PositionInfo(Position(16, 1), setOf(Direction.TOP, Direction.LEFT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(16, 2), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(16, 3), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(16, 4), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(16, 5), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(16, 6), setOf(Direction.LEFT, Direction.BOTTOM), ("Stap gezet.")))

        infos.add(PositionInfo(Position(16, 9), setOf(Direction.TOP, Direction.LEFT), ("Stap gezet.")))
        infos.add(PositionInfo(Position(16, 10), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(16, 11), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(16, 12), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(16, 13), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(16, 14), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(16, 15), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(16, 16), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(16, 17), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(16, 18), setOf(Direction.TOP, Direction.BOTTOM), ("Stap gezet.")))
        infos.add(PositionInfo(Position(16, 19), setOf(Direction.LEFT, Direction.BOTTOM), ("Stap gezet.")))

        return infos
    }
}



