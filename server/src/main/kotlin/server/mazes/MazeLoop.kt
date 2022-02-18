package server.mazes;

import common.Direction
import common.Position
import server.MoveOffsetInfo
import server.player.Player
import java.util.*

const val BRIDGE = "Je hebt een extra stap in dezelfde richting gedaan omdat je een brug overstak."
const val TELEPORTED = "Je stapte een teleport in en bent weer terug waar je begonnen bent."
const val ONEWAY = "Je bent van een richel afgesprongen helaas kan je niet weer terug naar de plek waar je vandaan kwam."
const val UNDER_BRIDGE = "Als je naar boven kijkt lijkt het wel alsof er een pad loopt."

class MazeLoop : Maze(UUID.fromString("a3f67367-c70a-45c2-8708-8e9df70a1954"), Position(10, 10), Player(1000)) {

    override fun generateMaze(): List<PositionInfo> {
        val infos = mutableListOf<PositionInfo>()
        infos.add(PositionInfo(Position(11, 11), //Start
            listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), """
            Welkom in dit magische maze. Dit maze heeft meerdere uitgangen maar niet elk pad is wat het lijkt.
            Belangrijk is het om bij te gaan houden waar je bent geweest, want het kan gebeuren dat je om een reden
            weer op dezelfde plek uitkomt. En dan is het handig dat je weet dat je misschien niet weer dezelfde stap
            doet. Verder zal er ook weinig tekst in dit doolhof langs komen behalve als er iets bijzonders gebeurt.
            Lukt het jouw om een van de vier uitgangen te vinden? 
        """.trimIndent() ))

        infos.add(PositionInfo(Position(2, 7), listOf(Direction.TOP, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(2, 8), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(2, 9), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(2, 10), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(2, 11), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), """
            Links van je zie je een soort van spiegel, als je goed inkijkt lijkt het wel alsof je jezelf 
            in de verte kan zien staan. Wat zou er gebeuren als je die kant op gaat
            """.trimIndent(),  offsets = mapOf(Direction.LEFT to MoveOffsetInfo(10,0, TELEPORTED)) )) // Teleport terug naar 11,11?
        infos.add(PositionInfo(Position(2, 12), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(2, 13), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(2, 14), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(2, 15), listOf(Direction.BOTTOM, Direction.RIGHT), "" ))

        infos.add(PositionInfo(Position(3, 7), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(3, 9), listOf(Direction.LEFT, Direction.RIGHT), "",
            offsets = mapOf(Direction.LEFT to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(3, 11), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(3, 13), listOf(Direction.LEFT, Direction.RIGHT), "",
            offsets = mapOf(Direction.LEFT to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(3, 15), listOf(Direction.LEFT, Direction.RIGHT), "" ))

        infos.add(PositionInfo(Position(4, 7), listOf(Direction.TOP, Direction.LEFT), "",
            offsets = mapOf(Direction.LEFT to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(4, 8), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(4, 9), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(4, 10), listOf(Direction.TOP, Direction.BOTTOM), "",
            offsets = mapOf(Direction.TOP to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(4, 11), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(4, 12), listOf(Direction.TOP, Direction.BOTTOM), "",
            offsets = mapOf(Direction.BOTTOM to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(4, 13), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(4, 14), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(4, 15), listOf(Direction.BOTTOM, Direction.LEFT), "",
            offsets = mapOf(Direction.LEFT to MoveOffsetInfo(text = ONEWAY)) ))

        infos.add(PositionInfo(Position(5, 7), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(5, 9), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(5, 11), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(5, 13), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(5, 15), listOf(Direction.LEFT, Direction.RIGHT), "" ))

        infos.add(PositionInfo(Position(6, 6), listOf(Direction.TOP, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(6, 7), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(6, 8), listOf(Direction.TOP, Direction.BOTTOM, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(6, 9), listOf(Direction.BOTTOM, Direction.LEFT), "" ))
        infos.add(PositionInfo(Position(6, 11), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(6, 13), listOf(Direction.TOP, Direction.LEFT), "" ))
        infos.add(PositionInfo(Position(6, 14), listOf(Direction.TOP, Direction.BOTTOM, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(6, 15), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(6, 16), listOf(Direction.BOTTOM, Direction.RIGHT), "" ))

        infos.add(PositionInfo(Position(7, 2), listOf(Direction.TOP, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(7, 3), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(7, 4), listOf(Direction.BOTTOM, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(7, 5), listOf(Direction.TOP, Direction.BOTTOM), "",
            offsets = mapOf(Direction.BOTTOM to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(7, 6), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(7, 7), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(7, 8), listOf(Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(7, 11), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(7, 14), listOf(Direction.TOP, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(7, 15), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(7, 16), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(7, 17), listOf(Direction.TOP, Direction.BOTTOM), "",
            offsets = mapOf(Direction.TOP to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(7, 18), listOf(Direction.TOP, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(7, 19), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(7, 20), listOf(Direction.BOTTOM, Direction.RIGHT), "" ))

        infos.add(PositionInfo(Position(8, 2), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(8, 4), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(8, 6), listOf(Direction.TOP, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(8, 7), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT), "" ))
        infos.add(PositionInfo(Position(8, 8), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(8, 9), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(8, 10), listOf(Direction.TOP, Direction.BOTTOM, Direction.RIGHT), "",
            offsets = mapOf(Direction.TOP to MoveOffsetInfo(0,1, BRIDGE)))) // Brug naar boven
        infos.add(PositionInfo(Position(8, 11), listOf(Direction.LEFT, Direction.RIGHT), UNDER_BRIDGE ))
        infos.add(PositionInfo(Position(8, 12), listOf(Direction.TOP, Direction.BOTTOM, Direction.RIGHT), "",
            offsets = mapOf(Direction.BOTTOM to MoveOffsetInfo(0,-1, BRIDGE)) )) // Brug naar beneden
        infos.add(PositionInfo(Position(8, 13), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(8, 14), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(8, 15), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT), "" ))
        infos.add(PositionInfo(Position(8, 16), listOf(Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(8, 18), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(8, 20), listOf(Direction.LEFT, Direction.RIGHT), "" ))

        infos.add(PositionInfo(Position(9, 2), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(9, 3), listOf(Direction.TOP, Direction.BOTTOM), "",
            offsets = mapOf(Direction.BOTTOM to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(9, 4), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(9, 5), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(9, 6), listOf(Direction.BOTTOM, Direction.LEFT), "" ))
        infos.add(PositionInfo(Position(9, 8), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(9, 10), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(9, 11), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(9, 12), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(9, 14), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(9, 16), listOf(Direction.TOP, Direction.LEFT), "" ))
        infos.add(PositionInfo(Position(9, 17), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(9, 18), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(9, 19), listOf(Direction.TOP, Direction.BOTTOM), "",
            offsets = mapOf(Direction.TOP to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(9, 20), listOf(Direction.LEFT, Direction.RIGHT), "" ))

        infos.add(PositionInfo(Position(10, 2), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(10, 4), listOf(Direction.LEFT, Direction.RIGHT), "",
            offsets = mapOf(Direction.RIGHT to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(10, 8), listOf(Direction.TOP, Direction.LEFT, Direction.RIGHT), "",
            offsets = mapOf(Direction.RIGHT to MoveOffsetInfo(1,0, BRIDGE)) )) // Brug naar rechts
        infos.add(PositionInfo(Position(10, 9), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(10, 10), listOf(Direction.BOTTOM, Direction.LEFT), "", true )) // End of maze
        infos.add(PositionInfo(Position(10, 11), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(10, 12), listOf(Direction.TOP, Direction.LEFT), "", true )) // End of maze
        infos.add(PositionInfo(Position(10, 13), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(10, 14), listOf(Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "",
            offsets = mapOf(Direction.RIGHT to MoveOffsetInfo(1,0, BRIDGE)))) // Brug naar rechts
        infos.add(PositionInfo(Position(10, 18), listOf(Direction.LEFT, Direction.RIGHT), "",
            offsets = mapOf(Direction.RIGHT to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(10, 20), listOf(Direction.LEFT, Direction.RIGHT), "" ))

        infos.add(PositionInfo(Position(11, 2), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), """
            Boven je zie je een soort van spiegel, als je goed inkijkt lijkt het wel alsof je jezelf 
            in de verte kan zien staan. Wat zou er gebeuren als je die kant op gaat
            """.trimIndent(),  offsets = mapOf(Direction.BOTTOM to MoveOffsetInfo(0,10, TELEPORTED)) )) // Teleport terug naar 11,11?
        infos.add(PositionInfo(Position(11, 3), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(11, 4), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(11, 5), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(11, 6), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(11, 7), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(11, 8), listOf(Direction.TOP, Direction.BOTTOM), UNDER_BRIDGE ))
        infos.add(PositionInfo(Position(11, 9), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(11, 10), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        // De start (11,11) staat als eerste benoemd, dus helemaal bovenaan
        infos.add(PositionInfo(Position(11, 12), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(11, 13), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(11, 14), listOf(Direction.TOP, Direction.BOTTOM), UNDER_BRIDGE ))
        infos.add(PositionInfo(Position(11, 15), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(11, 16), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(11, 17), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(11, 18), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(11, 19), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(11, 20), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), """
            Onder je zie je een soort van spiegel, als je goed inkijkt lijkt het wel alsof je jezelf 
            in de verte kan zien staan. Wat zou er gebeuren als je die kant op gaat
            """.trimIndent(),  offsets = mapOf(Direction.TOP to MoveOffsetInfo(0,-10, TELEPORTED)) )) // Teleport terug naar 11,11?

        infos.add(PositionInfo(Position(12, 2), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(12, 4), listOf(Direction.LEFT, Direction.RIGHT), "",
            offsets = mapOf(Direction.LEFT to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(12, 8), listOf(Direction.TOP, Direction.LEFT, Direction.RIGHT), "",
            offsets = mapOf(Direction.LEFT to MoveOffsetInfo(-1,0, BRIDGE)) )) // Brug naar links
        infos.add(PositionInfo(Position(12, 9), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(12, 10), listOf(Direction.BOTTOM, Direction.RIGHT), "", true )) // End of maze
        infos.add(PositionInfo(Position(12, 11), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(12, 12), listOf(Direction.TOP, Direction.RIGHT), "", true )) // End of maze
        infos.add(PositionInfo(Position(12, 13), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(12, 14), listOf(Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "",
            offsets = mapOf(Direction.LEFT to MoveOffsetInfo(-1,0, BRIDGE)) )) // Brug naar links
        infos.add(PositionInfo(Position(12, 18), listOf(Direction.LEFT, Direction.RIGHT), "",
            offsets = mapOf(Direction.LEFT to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(12, 20), listOf(Direction.LEFT, Direction.RIGHT), "" ))

        infos.add(PositionInfo(Position(13, 2), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(13, 3), listOf(Direction.TOP, Direction.BOTTOM), "",
            offsets = mapOf(Direction.BOTTOM to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(13, 4), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(13, 5), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(13, 6), listOf(Direction.BOTTOM, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(13, 8), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(13, 10), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(13, 11), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(13, 12), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(13, 14), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(13, 16), listOf(Direction.TOP, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(13, 17), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(13, 18), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(13, 19), listOf(Direction.TOP, Direction.BOTTOM), "",
            offsets = mapOf(Direction.TOP to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(13, 20), listOf(Direction.LEFT, Direction.RIGHT), "" ))

        infos.add(PositionInfo(Position(14, 2), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(14, 4), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(14, 6), listOf(Direction.TOP, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(14, 7), listOf(Direction.TOP, Direction.BOTTOM, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(14, 8), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(14, 9), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(14, 10), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT), "",
            offsets = mapOf(Direction.TOP to MoveOffsetInfo(0,1, BRIDGE)) )) // Brug naar boven
        infos.add(PositionInfo(Position(14, 11), listOf(Direction.LEFT, Direction.RIGHT), UNDER_BRIDGE ))
        infos.add(PositionInfo(Position(14, 12), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT), "",
            offsets = mapOf(Direction.BOTTOM to MoveOffsetInfo(0,-1, BRIDGE)) )) // Brug naar beneden
        infos.add(PositionInfo(Position(14, 13), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(14, 14), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(14, 15), listOf(Direction.TOP, Direction.BOTTOM, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(14, 16), listOf(Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(14, 18), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(14, 20), listOf(Direction.LEFT, Direction.RIGHT), "" ))

        infos.add(PositionInfo(Position(15, 2), listOf(Direction.TOP, Direction.LEFT), "" ))
        infos.add(PositionInfo(Position(15, 3), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(15, 4), listOf(Direction.BOTTOM, Direction.LEFT), "" ))
        infos.add(PositionInfo(Position(15, 5), listOf(Direction.TOP, Direction.BOTTOM), "",
            offsets = mapOf(Direction.BOTTOM to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(15, 6), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(15, 7), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(15, 8), listOf(Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(15, 11), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(15, 14), listOf(Direction.TOP, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(15, 15), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(15, 16), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(15, 17), listOf(Direction.TOP, Direction.BOTTOM), "",
            offsets = mapOf(Direction.TOP to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(15, 18), listOf(Direction.TOP, Direction.LEFT), "" ))
        infos.add(PositionInfo(Position(15, 19), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(15, 20), listOf(Direction.BOTTOM, Direction.LEFT), "" ))

        infos.add(PositionInfo(Position(16, 6), listOf(Direction.TOP, Direction.LEFT), "" ))
        infos.add(PositionInfo(Position(16, 7), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(16, 8), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT), "" ))
        infos.add(PositionInfo(Position(16, 9), listOf(Direction.BOTTOM, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(16, 11), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(16, 13), listOf(Direction.TOP, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(16, 14), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT), "" ))
        infos.add(PositionInfo(Position(16, 15), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(16, 16), listOf(Direction.BOTTOM, Direction.LEFT), "" ))

        infos.add(PositionInfo(Position(17, 7), listOf(Direction.LEFT, Direction.RIGHT), "",
            offsets = mapOf(Direction.RIGHT to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(17, 9), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(17, 11), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(17, 13), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(17, 15), listOf(Direction.LEFT, Direction.RIGHT), "",
            offsets = mapOf(Direction.RIGHT to MoveOffsetInfo(text = ONEWAY)) ))

        infos.add(PositionInfo(Position(18, 7), listOf(Direction.TOP, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(18, 8), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(18, 9), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(18, 10), listOf(Direction.TOP, Direction.BOTTOM), "",
            offsets = mapOf(Direction.TOP to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(18, 11), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(18, 12), listOf(Direction.TOP, Direction.BOTTOM), "",
            offsets = mapOf(Direction.BOTTOM to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(18, 13), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(18, 14), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(18, 15), listOf(Direction.BOTTOM, Direction.RIGHT), "" ))

        infos.add(PositionInfo(Position(19, 7), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(19, 9), listOf(Direction.LEFT, Direction.RIGHT), "",
            offsets = mapOf(Direction.RIGHT to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(19, 11), listOf(Direction.LEFT, Direction.RIGHT), "" ))
        infos.add(PositionInfo(Position(19, 13), listOf(Direction.LEFT, Direction.RIGHT), "",
            offsets = mapOf(Direction.RIGHT to MoveOffsetInfo(text = ONEWAY)) ))
        infos.add(PositionInfo(Position(19, 15), listOf(Direction.LEFT, Direction.RIGHT), "" ))

        infos.add(PositionInfo(Position(20, 7), listOf(Direction.TOP, Direction.LEFT), "" ))
        infos.add(PositionInfo(Position(20, 8), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(20, 9), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(20, 10), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(20, 11), listOf(Direction.TOP, Direction.BOTTOM, Direction.LEFT, Direction.RIGHT), """
            Rechts van je zie je een soort van spiegel, als je goed inkijkt lijkt het wel alsof je jezelf 
            in de verte kan zien staan. Wat zou er gebeuren als je die kant op gaat
            """.trimIndent() ,  offsets = mapOf(Direction.RIGHT to MoveOffsetInfo(-10,0, TELEPORTED)))) // Teleport terug naar 11,11?
        infos.add(PositionInfo(Position(20, 12), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(20, 13), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(20, 14), listOf(Direction.TOP, Direction.BOTTOM), "" ))
        infos.add(PositionInfo(Position(20, 15), listOf(Direction.BOTTOM, Direction.LEFT), "" ))

        return infos
    }
}
