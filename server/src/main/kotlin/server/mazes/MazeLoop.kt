package server.mazes;

import common.Direction
import common.Position
import server.model.MoveOffsetInfo
import server.model.Player
import server.model.PositionInfo
import java.util.*

const val BRIDGE = "Je hebt een extra stap in dezelfde richting gedaan omdat je een brug overstak."
const val TELEPORTED = "Je stapte een teleport in en bent weer terug waar je begonnen bent."
const val ONEWAY = "Je bent van een richel afgesprongen helaas kan je niet weer terug naar de plek waar je vandaan kwam."
const val UNDER_BRIDGE = "Als je naar boven kijkt lijkt het wel alsof er een pad loopt."

class MazeLoop : Maze(UUID.fromString("a3f67367-c70a-45c2-8708-8e9df70a1954"), Position(10, 10), Player(1000)) {

    override fun generateMaze(): List<PositionInfo> {
        val infos = mutableListOf<PositionInfo>()
        infos.add(
            PositionInfo(
                Position(11, 11), //Start
                setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), """
            Welkom in dit magische maze. Dit maze heeft meerdere uitgangen maar niet elk pad is wat het lijkt.
            Belangrijk is het om bij te gaan houden waar je bent geweest, en welke richt je bent op gegaan, 
            want het kan gebeuren dat je om een reden weer op dezelfde plek uitkomt. 
            En dan is het handig dat je weet dat je misschien niet weer dezelfde stap doet. 
            Verder zal er ook weinig tekst in dit doolhof langs komen behalve als er iets bijzonders gebeurt.
            Lukt het jouw om een van de vier uitgangen te vinden? 
        """.trimIndent()
            )
        )

        addColumn02(infos)
        addColumn03(infos)
        addColumn04(infos)
        addColumn05(infos)
        addColumn06(infos)
        addColumn07(infos)
        addColumn08(infos)
        addColumn09(infos)
        addColumn10(infos)
        addColumn11(infos)
        addColumn12(infos)
        addColumn13(infos)
        addColumn14(infos)
        addColumn15(infos)
        addColumn16(infos)
        addColumn17(infos)
        addColumn18(infos)
        addColumn19(infos)
        addColumn20(infos)

        return infos
    }

    private fun addColumn02(infos: MutableList<PositionInfo>) {
        infos.add(PositionInfo(Position(2, 7), setOf(Direction.NORTH, Direction.EAST), ""))
        infos.add(PositionInfo(Position(2, 8), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(2, 9), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(2, 10), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(
            PositionInfo(
                Position(2, 11), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), """
                    Links van je zie je een soort van spiegel, als je goed inkijkt lijkt het wel alsof je jezelf 
                    in de verte kan zien staan. Wat zou er gebeuren als je die kant op gaat
                    """.trimIndent(), offsets = mapOf(Direction.WEST to MoveOffsetInfo(10, 0, TELEPORTED))
            )
        ) // Teleport terug naar 11,11?
        infos.add(PositionInfo(Position(2, 12), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(2, 13), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(2, 14), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(2, 15), setOf(Direction.SOUTH, Direction.EAST), ""))
    }

    private fun addColumn03(infos: MutableList<PositionInfo>) {
        infos.add(PositionInfo(Position(3, 7), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(
            PositionInfo(
                Position(3, 9), setOf(Direction.WEST, Direction.EAST), "",
                offsets = mapOf(Direction.WEST to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(3, 11), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(
            PositionInfo(
                Position(3, 13), setOf(Direction.WEST, Direction.EAST), "",
                offsets = mapOf(Direction.WEST to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(3, 15), setOf(Direction.WEST, Direction.EAST), ""))
    }

    private fun addColumn04(infos: MutableList<PositionInfo>) {
        infos.add(
            PositionInfo(
                Position(4, 7), setOf(Direction.NORTH, Direction.WEST), "",
                offsets = mapOf(Direction.WEST to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(4, 8), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(4, 9), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(
            PositionInfo(
                Position(4, 10), setOf(Direction.NORTH, Direction.SOUTH), "",
                offsets = mapOf(Direction.NORTH to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(4, 11), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(
            PositionInfo(
                Position(4, 12), setOf(Direction.NORTH, Direction.SOUTH), "",
                offsets = mapOf(Direction.SOUTH to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(4, 13), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(4, 14), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(
            PositionInfo(
                Position(4, 15), setOf(Direction.SOUTH, Direction.WEST), "",
                offsets = mapOf(Direction.WEST to MoveOffsetInfo(text = ONEWAY))
            )
        )
    }

    private fun addColumn05(infos: MutableList<PositionInfo>) {
        infos.add(PositionInfo(Position(5, 7), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(5, 9), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(5, 11), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(5, 13), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(5, 15), setOf(Direction.WEST, Direction.EAST), ""))
    }

    private fun addColumn06(infos: MutableList<PositionInfo>) {
        infos.add(PositionInfo(Position(6, 6), setOf(Direction.NORTH, Direction.EAST), ""))
        infos.add(PositionInfo(Position(6, 7), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(6, 8), setOf(Direction.NORTH, Direction.SOUTH, Direction.EAST), ""))
        infos.add(PositionInfo(Position(6, 9), setOf(Direction.SOUTH, Direction.WEST), ""))
        infos.add(PositionInfo(Position(6, 11), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(6, 13), setOf(Direction.NORTH, Direction.WEST), ""))
        infos.add(PositionInfo(Position(6, 14), setOf(Direction.NORTH, Direction.SOUTH, Direction.EAST), ""))
        infos.add(PositionInfo(Position(6, 15), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(6, 16), setOf(Direction.SOUTH, Direction.EAST), ""))
    }

    private fun addColumn07(infos: MutableList<PositionInfo>) {
        infos.add(PositionInfo(Position(7, 2), setOf(Direction.NORTH, Direction.EAST), ""))
        infos.add(PositionInfo(Position(7, 3), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(7, 4), setOf(Direction.SOUTH, Direction.EAST), ""))
        infos.add(
            PositionInfo(
                Position(7, 5), setOf(Direction.NORTH, Direction.SOUTH), "",
                offsets = mapOf(Direction.SOUTH to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(7, 6), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(7, 7), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(7, 8), setOf(Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(7, 11), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(7, 14), setOf(Direction.NORTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(7, 15), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(7, 16), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(
            PositionInfo(
                Position(7, 17), setOf(Direction.NORTH, Direction.SOUTH), "",
                offsets = mapOf(Direction.NORTH to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(7, 18), setOf(Direction.NORTH, Direction.EAST), ""))
        infos.add(PositionInfo(Position(7, 19), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(7, 20), setOf(Direction.SOUTH, Direction.EAST), ""))
    }

    private fun addColumn08(infos: MutableList<PositionInfo>) {
        infos.add(PositionInfo(Position(8, 2), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(8, 4), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(8, 6), setOf(Direction.NORTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(8, 7), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST), ""))
        infos.add(PositionInfo(Position(8, 8), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(8, 9), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(
            PositionInfo(
                Position(8, 10), setOf(Direction.NORTH, Direction.SOUTH, Direction.EAST), "",
                offsets = mapOf(Direction.NORTH to MoveOffsetInfo(0, 1, BRIDGE))
            )
        ) // Brug naar boven
        infos.add(PositionInfo(Position(8, 11), setOf(Direction.WEST, Direction.EAST), UNDER_BRIDGE))
        infos.add(
            PositionInfo(
                Position(8, 12), setOf(Direction.NORTH, Direction.SOUTH, Direction.EAST), "",
                offsets = mapOf(Direction.SOUTH to MoveOffsetInfo(0, -1, BRIDGE))
            )
        ) // Brug naar beneden
        infos.add(PositionInfo(Position(8, 13), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(8, 14), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(8, 15), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST), ""))
        infos.add(PositionInfo(Position(8, 16), setOf(Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(8, 18), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(8, 20), setOf(Direction.WEST, Direction.EAST), ""))
    }

    private fun addColumn09(infos: MutableList<PositionInfo>) {
        infos.add(PositionInfo(Position(9, 2), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(
            PositionInfo(
                Position(9, 3), setOf(Direction.NORTH, Direction.SOUTH), "",
                offsets = mapOf(Direction.SOUTH to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(9, 4), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(9, 5), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(9, 6), setOf(Direction.SOUTH, Direction.WEST), ""))
        infos.add(PositionInfo(Position(9, 8), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(9, 10), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(9, 11), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(9, 12), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(9, 14), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(9, 16), setOf(Direction.NORTH, Direction.WEST), ""))
        infos.add(PositionInfo(Position(9, 17), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(9, 18), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(
            PositionInfo(
                Position(9, 19), setOf(Direction.NORTH, Direction.SOUTH), "",
                offsets = mapOf(Direction.NORTH to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(9, 20), setOf(Direction.WEST, Direction.EAST), ""))
    }

    private fun addColumn10(infos: MutableList<PositionInfo>) {
        infos.add(PositionInfo(Position(10, 2), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(
            PositionInfo(
                Position(10, 4), setOf(Direction.WEST, Direction.EAST), "",
                offsets = mapOf(Direction.EAST to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(
            PositionInfo(
                Position(10, 8), setOf(Direction.NORTH, Direction.WEST, Direction.EAST), "",
                offsets = mapOf(Direction.EAST to MoveOffsetInfo(1, 0, BRIDGE))
            )
        ) // Brug naar rechts
        infos.add(PositionInfo(Position(10, 9), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(10, 10), setOf(Direction.SOUTH, Direction.WEST), "", true)) // End of maze
        infos.add(PositionInfo(Position(10, 11), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(10, 12), setOf(Direction.NORTH, Direction.WEST), "", true)) // End of maze
        infos.add(PositionInfo(Position(10, 13), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(
            PositionInfo(
                Position(10, 14), setOf(Direction.SOUTH, Direction.WEST, Direction.EAST), "",
                offsets = mapOf(Direction.EAST to MoveOffsetInfo(1, 0, BRIDGE))
            )
        ) // Brug naar rechts
        infos.add(
            PositionInfo(
                Position(10, 18), setOf(Direction.WEST, Direction.EAST), "",
                offsets = mapOf(Direction.EAST to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(10, 20), setOf(Direction.WEST, Direction.EAST), ""))
    }

    private fun addColumn11(infos: MutableList<PositionInfo>) {
        infos.add(
            PositionInfo(
                Position(11, 2), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), """
                Boven je zie je een soort van spiegel, als je goed inkijkt lijkt het wel alsof je jezelf 
                in de verte kan zien staan. Wat zou er gebeuren als je die kant op gaat
                """.trimIndent(), offsets = mapOf(Direction.SOUTH to MoveOffsetInfo(0, 10, TELEPORTED))
            )
        ) // Teleport terug naar 11,11?
        infos.add(PositionInfo(Position(11, 3), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(11, 4), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(11, 5), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(11, 6), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(11, 7), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(11, 8), setOf(Direction.NORTH, Direction.SOUTH), UNDER_BRIDGE))
        infos.add(PositionInfo(Position(11, 9), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(11, 10), setOf(Direction.NORTH, Direction.SOUTH), ""))
        // De start (11,11) staat als eerste benoemd, dus helemaal bovenaan
        infos.add(PositionInfo(Position(11, 12), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(11, 13), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(11, 14), setOf(Direction.NORTH, Direction.SOUTH), UNDER_BRIDGE))
        infos.add(PositionInfo(Position(11, 15), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(11, 16), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(11, 17), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(11, 18), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(11, 19), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(
            PositionInfo(
                Position(11, 20), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), """
                Onder je zie je een soort van spiegel, als je goed inkijkt lijkt het wel alsof je jezelf 
                in de verte kan zien staan. Wat zou er gebeuren als je die kant op gaat
                """.trimIndent(), offsets = mapOf(Direction.NORTH to MoveOffsetInfo(0, -10, TELEPORTED))
            )
        ) // Teleport terug naar 11,11?
    }

    private fun addColumn12(infos: MutableList<PositionInfo>) {
        infos.add(PositionInfo(Position(12, 2), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(
            PositionInfo(
                Position(12, 4), setOf(Direction.WEST, Direction.EAST), "",
                offsets = mapOf(Direction.WEST to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(
            PositionInfo(
                Position(12, 8), setOf(Direction.NORTH, Direction.WEST, Direction.EAST), "",
                offsets = mapOf(Direction.WEST to MoveOffsetInfo(-1, 0, BRIDGE))
            )
        ) // Brug naar links
        infos.add(PositionInfo(Position(12, 9), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(12, 10), setOf(Direction.SOUTH, Direction.EAST), "", true)) // End of maze
        infos.add(PositionInfo(Position(12, 11), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(12, 12), setOf(Direction.NORTH, Direction.EAST), "", true)) // End of maze
        infos.add(PositionInfo(Position(12, 13), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(
            PositionInfo(
                Position(12, 14), setOf(Direction.SOUTH, Direction.WEST, Direction.EAST), "",
                offsets = mapOf(Direction.WEST to MoveOffsetInfo(-1, 0, BRIDGE))
            )
        ) // Brug naar links
        infos.add(
            PositionInfo(
                Position(12, 18), setOf(Direction.WEST, Direction.EAST), "",
                offsets = mapOf(Direction.WEST to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(12, 20), setOf(Direction.WEST, Direction.EAST), ""))
    }

    private fun addColumn13(infos: MutableList<PositionInfo>) {
        infos.add(PositionInfo(Position(13, 2), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(
            PositionInfo(
                Position(13, 3), setOf(Direction.NORTH, Direction.SOUTH), "",
                offsets = mapOf(Direction.SOUTH to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(13, 4), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(13, 5), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(13, 6), setOf(Direction.SOUTH, Direction.EAST), ""))
        infos.add(PositionInfo(Position(13, 8), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(13, 10), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(13, 11), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(13, 12), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(13, 14), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(13, 16), setOf(Direction.NORTH, Direction.EAST), ""))
        infos.add(PositionInfo(Position(13, 17), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(13, 18), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(
            PositionInfo(
                Position(13, 19), setOf(Direction.NORTH, Direction.SOUTH), "",
                offsets = mapOf(Direction.NORTH to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(13, 20), setOf(Direction.WEST, Direction.EAST), ""))
    }

    private fun addColumn14(infos: MutableList<PositionInfo>) {
        infos.add(PositionInfo(Position(14, 2), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(14, 4), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(14, 6), setOf(Direction.NORTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(14, 7), setOf(Direction.NORTH, Direction.SOUTH, Direction.EAST), ""))
        infos.add(PositionInfo(Position(14, 8), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(14, 9), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(
            PositionInfo(
                Position(14, 10), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST), "",
                offsets = mapOf(Direction.NORTH to MoveOffsetInfo(0, 1, BRIDGE))
            )
        ) // Brug naar boven
        infos.add(PositionInfo(Position(14, 11), setOf(Direction.WEST, Direction.EAST), UNDER_BRIDGE))
        infos.add(
            PositionInfo(
                Position(14, 12), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST), "",
                offsets = mapOf(Direction.SOUTH to MoveOffsetInfo(0, -1, BRIDGE))
            )
        ) // Brug naar beneden
        infos.add(PositionInfo(Position(14, 13), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(14, 14), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(14, 15), setOf(Direction.NORTH, Direction.SOUTH, Direction.EAST), ""))
        infos.add(PositionInfo(Position(14, 16), setOf(Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(14, 18), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(14, 20), setOf(Direction.WEST, Direction.EAST), ""))
    }

    private fun addColumn15(infos: MutableList<PositionInfo>) {
        infos.add(PositionInfo(Position(15, 2), setOf(Direction.NORTH, Direction.WEST), ""))
        infos.add(PositionInfo(Position(15, 3), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(15, 4), setOf(Direction.SOUTH, Direction.WEST), ""))
        infos.add(
            PositionInfo(
                Position(15, 5), setOf(Direction.NORTH, Direction.SOUTH), "",
                offsets = mapOf(Direction.SOUTH to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(15, 6), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(15, 7), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(15, 8), setOf(Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(15, 11), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(15, 14), setOf(Direction.NORTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(15, 15), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(15, 16), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(
            PositionInfo(
                Position(15, 17), setOf(Direction.NORTH, Direction.SOUTH), "",
                offsets = mapOf(Direction.NORTH to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(15, 18), setOf(Direction.NORTH, Direction.WEST), ""))
        infos.add(PositionInfo(Position(15, 19), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(15, 20), setOf(Direction.SOUTH, Direction.WEST), ""))
    }

    private fun addColumn16(infos: MutableList<PositionInfo>) {
        infos.add(PositionInfo(Position(16, 6), setOf(Direction.NORTH, Direction.WEST), ""))
        infos.add(PositionInfo(Position(16, 7), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(16, 8), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST), ""))
        infos.add(PositionInfo(Position(16, 9), setOf(Direction.SOUTH, Direction.EAST), ""))
        infos.add(PositionInfo(Position(16, 11), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(16, 13), setOf(Direction.NORTH, Direction.EAST), ""))
        infos.add(PositionInfo(Position(16, 14), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST), ""))
        infos.add(PositionInfo(Position(16, 15), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(16, 16), setOf(Direction.SOUTH, Direction.WEST), ""))
    }

    private fun addColumn17(infos: MutableList<PositionInfo>) {
        infos.add(
            PositionInfo(
                Position(17, 7), setOf(Direction.WEST, Direction.EAST), "",
                offsets = mapOf(Direction.EAST to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(17, 9), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(17, 11), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(17, 13), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(
            PositionInfo(
                Position(17, 15), setOf(Direction.WEST, Direction.EAST), "",
                offsets = mapOf(Direction.EAST to MoveOffsetInfo(text = ONEWAY))
            )
        )
    }

    private fun addColumn18(infos: MutableList<PositionInfo>) {
        infos.add(PositionInfo(Position(18, 7), setOf(Direction.NORTH, Direction.EAST), ""))
        infos.add(PositionInfo(Position(18, 8), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(18, 9), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(
            PositionInfo(
                Position(18, 10), setOf(Direction.NORTH, Direction.SOUTH), "",
                offsets = mapOf(Direction.NORTH to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(18, 11), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(
            PositionInfo(
                Position(18, 12), setOf(Direction.NORTH, Direction.SOUTH), "",
                offsets = mapOf(Direction.SOUTH to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(18, 13), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), ""))
        infos.add(PositionInfo(Position(18, 14), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(18, 15), setOf(Direction.SOUTH, Direction.EAST), ""))
    }

    private fun addColumn19(infos: MutableList<PositionInfo>) {
        infos.add(PositionInfo(Position(19, 7), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(
            PositionInfo(
                Position(19, 9), setOf(Direction.WEST, Direction.EAST), "",
                offsets = mapOf(Direction.EAST to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(19, 11), setOf(Direction.WEST, Direction.EAST), ""))
        infos.add(
            PositionInfo(
                Position(19, 13), setOf(Direction.WEST, Direction.EAST), "",
                offsets = mapOf(Direction.EAST to MoveOffsetInfo(text = ONEWAY))
            )
        )
        infos.add(PositionInfo(Position(19, 15), setOf(Direction.WEST, Direction.EAST), ""))
    }

    private fun addColumn20(infos: MutableList<PositionInfo>) {
        infos.add(PositionInfo(Position(20, 7), setOf(Direction.NORTH, Direction.WEST), ""))
        infos.add(PositionInfo(Position(20, 8), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(20, 9), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(20, 10), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(
            PositionInfo(
                Position(20, 11), setOf(Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST), """
                Rechts van je zie je een soort van spiegel, als je goed inkijkt lijkt het wel alsof je jezelf 
                in de verte kan zien staan. Wat zou er gebeuren als je die kant op gaat
                """.trimIndent(), offsets = mapOf(Direction.EAST to MoveOffsetInfo(-10, 0, TELEPORTED))
            )
        ) // Teleport terug naar 11,11?
        infos.add(PositionInfo(Position(20, 12), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(20, 13), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(20, 14), setOf(Direction.NORTH, Direction.SOUTH), ""))
        infos.add(PositionInfo(Position(20, 15), setOf(Direction.SOUTH, Direction.WEST), ""))
    }
}
