package server.mazes

import common.Direction
import common.Position
import server.player.Player
import java.util.*

class Maze01 : Maze(UUID.fromString("94e2254e-5c5d-4395-b807-8ac3d713e1b3"), common.Position(0, 0), Player(15)) {
    override fun generateMaze(): List<PositionInfo> {
        val infos = mutableListOf<PositionInfo>()
        infos.add(PositionInfo( //start
                Position(0, 0), listOf(Direction.TOP),
                """
            Welkom het is gelukt om de server te starten en de client er mee te laten praten. 
            
            Eerst een paar huishoudelijke mededelingen:
            * De aanpassingen die je moet doen zitten in Client.Kt
            * Je kan de server gewoon laten draaien, deze onthoud wat je laatste positie in een level was.
            * Zet aan het begin het mazeId van waar je mee bezig bent, het Id van level 1 is al gegeven maar van de andere levels moet je zien te vinden
            * Wil je een level opnieuw beginnen dan kan je deze resetten (het kan dan gebeuren dat het level er iets anders uitziet)
              Zie een van de eerste regels in de Client.kt
            * Door een level niet te resetten kan je dus iedere keer kleine stapjes doen om verder te komen maar dan moet je wel je vorige stapjes niet uitvoeren.
              Want anders kom je misschien wel ergens anders uit als dat je dacht.
            
            Dit is het eerste level. Om naar de uitgang te komen moet je in dit level een aantal stappen in verschillende richtingen verplaatsen.
            Dit kan je doen door aan de client een regel toe te voegen die de server aanspoort om je te verplaatsen.
            Als eerste moet er een stap naar boven gedaan worden.
            Voor het gemak: ApiSync.move(mazeId, Direction.TOP)
            Vervolgens wil je de info weten van de positie waar je bent dus vraag je die op: ApiSync.getCurrentPosition(mazeId)
            En vergeet niet om de informatie van de nieuwe positie te printen naar de console via de printInfo functie.
            Een voorbeeldje staal al in de Client.kt
        """.trimIndent()
        ))
        infos.add(PositionInfo( //stap1
                Position(0, 1), listOf(Direction.BOTTOM, Direction.RIGHT),
                """
            Je hebt je eerste stapje gezet. Hoera!!!!
            Nu moet je 4 stappen naar rechts.
            Dit kan je doen door: ApiSync.move(mazeId, Direction.RIGHT) 4x achter elkaar te zetten maar mooier is een for-loop.
            for(i in 1..4) {
                ApiSync.move(mazeId, Direction.RIGHT)
            }
        """.trimIndent()
        ))
        infos.add(PositionInfo( //stap2
                Position(1, 1), listOf(Direction.LEFT, Direction.RIGHT),
                """
            Nog 3 stappen naar rechts te gaan.
        """.trimIndent()
        ))
        infos.add(PositionInfo( //stap3
                Position(2, 1), listOf(Direction.LEFT, Direction.RIGHT),
                """
            Nog 2 stappen naar rechts te gaan.
        """.trimIndent()
        ))
        infos.add(PositionInfo( //stap4
                Position(3, 1), listOf(Direction.LEFT, Direction.RIGHT),
                """
            Nog 1 stap naar rechts te gaan.
        """.trimIndent()
        ))
        infos.add(PositionInfo( //stap5
                Position(4, 1), listOf(Direction.LEFT, Direction.TOP),
                """
            Yes je bent weer op een beslis punt. Nu moet je een aantal stappen omhoog gaan lopen (ergens tussen de 1 en 6). 
            Maar ja hoeveel het er zijn dat weet niemand......
            Wanneer je een stap hebt gelopen en je de positie info opvraagt dan kan je zien welke richtingen je allemaal mag oplopen.
            Dit zou je kunnen gebruiken tot je aan het eind bent door iedere keer een stap te zetten en vervolgens te kijken of je nog verder kan.
            if(info.allowedDirections.contains(Direction.TOP)) { /*verplaats naar boven*/ } else { /*stoppen met de loop*/ }
            Hierbij is info de opgehaalde positie info.  
        """.trimIndent()
        ))
        val j = (0..4).random()
        for (i in 0..j) {
            infos.add(PositionInfo( //stap
                    Position(4, 2 + i), listOf(Direction.BOTTOM, Direction.TOP),
                    """
            Nog meer stappen te gaan
        """.trimIndent()
            ))
        }
        val row = 3 + j
        infos.add(PositionInfo( //stap 6
                Position(4, row), listOf(Direction.BOTTOM, Direction.LEFT, Direction.RIGHT),
                """
            Je bent beland op een splitsing. Nu moet je een keuze gaan maken of je links of rechts af gaat.
            Aan het eind van de gang is het einde van het level.
            Maak een wijze keuze.
        """.trimIndent()
        ))
        infos.add(PositionInfo( //stap 6 l1
                Position(3, row), listOf(Direction.LEFT, Direction.RIGHT),
                """
            Dit is (nog) niet het einde van deze gang.
        """.trimIndent()
        ))
        infos.add(PositionInfo( //stap 6 l2
                Position(2, row), listOf(Direction.LEFT, Direction.RIGHT),
                """
            Hmmm dit is (nog) niet het einde, maar je kan nog verder.
        """.trimIndent()
        ))
        infos.add(PositionInfo( //stap 6 l3
                Position(1, row), listOf(Direction.RIGHT),
                """
            Je hebt de verkeerde keuze gemaakt want dit is een doodlopende weg en niet het einde.
            Had je toch de andere kant moeten kiezen. Dat wordt terug lopen.
        """.trimIndent()
        ))
        infos.add(PositionInfo( //stap 6 r1
                Position(5, row), listOf(Direction.LEFT, Direction.RIGHT),
                """
            Hmmm dit is (nog) niet het einde, maar gelukkig kan je nog verder lopen
        """.trimIndent()
        ))
        infos.add(PositionInfo( //stap 6 r2
                Position(6, row), listOf(Direction.LEFT, Direction.RIGHT),
                """
            Hmmm dit is (nog steeds) niet het einde, maar je kan nog verder.
        """.trimIndent()
        ))
        infos.add(PositionInfo( //The End
                Position(7, row), listOf(Direction.LEFT),
                """
            Woohooo! dit is het eindpunt. Je hebt nu een paar basis principes van Kotlin geleerd (for-loop en if-statement).
            In het volgende level moet je dit slimmer gaan inzetten want dan wordt je minder aan de hand meegenomen.
            Het ID van het volgende level is: 6bec1ac2-ad66-4a9e-aff7-52581d1008e7
        """.trimIndent(), true))
        return infos
    }
}



