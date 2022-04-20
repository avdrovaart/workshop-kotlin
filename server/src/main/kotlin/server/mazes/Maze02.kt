package server.mazes

import common.Direction
import common.Position
import server.model.AnswerPuzzle
import server.model.InventoryPuzzle
import server.model.Player
import server.model.PositionInfo
import java.util.*


class Maze02 : Maze(UUID.fromString("6bec1ac2-ad66-4a9e-aff7-52581d1008e7"), common.Position(0, 0), Player(100)) {
    override fun generateMaze(): List<PositionInfo> {
        val infos = mutableListOf<PositionInfo>()
        infos.add(
            PositionInfo( //start
                Position(0, 0), setOf(Direction.NORTH),
                """
                    Welkom in dit tweede level, dit is een klein level maar bevat puzzles.
                    Het lukt je vast wel om ze op te lossen.
                """.trimMargin()
            )
        )
        val puzzle1 = InventoryPuzzle(setOf(Direction.EAST), "key")
        infos.add(
            PositionInfo(
                Position(0, 1),
                setOf(Direction.NORTH, Direction.SOUTH),
                "Er zit hier rechts een deur maar die zit op slot.",
                puzzle = puzzle1
            )
        )
        infos.add(
            PositionInfo(
                Position(0, 2),
                setOf(Direction.SOUTH),
                "Hier ligt een sleutel, deze heb je opgepakt en zit nu in je inventory.",
                items = setOf("key")
            )
        )
        val puzzle2 = AnswerPuzzle(
            setOf(Direction.EAST), "3654", """
            De cijfer code is het antwoord van de volgende sommen:
                2 + 1 =
                2 x 3 = 
                9 - 4 =
                8 / 2 = 
            """.trimIndent(),
            "Je hebt het juiste antwoord op de puzzel gegeven."
        )
        infos.add(
            PositionInfo(
                Position(1, 1),
                setOf(Direction.WEST),
                "Hmmm, om verder te komen moet je een cijfer code opgeven.",
                puzzle = puzzle2
            )
        )
        infos.add(
            PositionInfo(
                Position(2, 1),
                setOf(Direction.WEST),
                "Yes je hebt het einde gehaald, dit is de code voor het volgende level: 264cc5b8-b00c-11ec-b909-0242ac120002",
                true
            )
        )
        return infos
    }
}



