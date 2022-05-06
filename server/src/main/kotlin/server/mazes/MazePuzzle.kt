package server.mazes

import common.Direction
import common.Position
import server.model.AnswerPuzzle
import server.model.Player
import server.model.PositionInfo
import java.util.*

class MazePuzzle : Maze(UUID.fromString("1be61571-828f-4a18-b318-54cabac31412"), Position(0, 0), Player(15)) {
    override fun generateMaze(): List<PositionInfo> {
        val infos = mutableListOf<PositionInfo>()
        infos.add(
            PositionInfo( //start
                Position(0, 0), setOf(Direction.EAST),
                """
                    Welkom in dit speciale Kotlin puzzel level. Inmiddels weet je hoe je puzzels moet oplossen. Dit level bevat 
                    een aantal korte Kotlin opdrachtjes die je op moet lossen. Succes!
                """.trimIndent()
            )
        )

        // Opdracht 1: Simple functions
        val puzzle01 = AnswerPuzzle(
            setOf(Direction.EAST), "OK", """
                Copy & paste onderstaande functie ergens in je client:
                
                fun start(): String = TODO()
                
                Copy & paste onderstaand statement in je main() om de puzzel op te lossen:
                
                ApiSync.solve(mazeId, start())
                
                Wijzig de functie start() zodat deze "OK" teruggeeft, zonder een return statement te gebruiken. Bekijk eventueel 
                de Kotlin functions syntax (https://kotlinlang.org/docs/basic-syntax.html#functions) als je er niet uitkomt.
            """.trimIndent(),
            "Je hebt de opdracht opgelost. Je kunt nu verder naar het oosten voor je volgende opdracht."
        )
        infos.add(
            PositionInfo(
                Position(1, 0),
                setOf(Direction.WEST),
                "Opdracht 1: Simple functions",
                puzzle = puzzle01
            )
        )

        // Opdracht 2: Named arguments
        val puzzle02 = AnswerPuzzle(
            setOf(Direction.EAST), "[a, b, c]", """
                Copy & paste onderstaande functie ergens in je client:
                
                fun joinOptions(options: Collection<String>) =
                        options.joinToString(TODO())
                
                Copy & paste onderstaand statement in je main() om de puzzel op te lossen:
                
                ApiSync.solve(mazeId, joinOptions(listOf("a", "b", "c")))
                
                Wijzig de functie joinOptions() zodat deze een JSON string "[a, b, c]" teruggeeft. De documentatie van joinToString()
                staat hier: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/join-to-string.html. Bekijk eventueel ook  
                de Kotlin default arguments syntax (https://kotlinlang.org/docs/functions.html#default-arguments) als je er niet uitkomt.
            """.trimIndent(),
            "Je hebt de opdracht opgelost. Je kunt nu verder naar het oosten voor je volgende opdracht."
        )
        infos.add(
            PositionInfo(
                Position(2, 0),
                setOf(Direction.WEST),
                "Opdracht 2: Named arguments",
                puzzle = puzzle02
            )
        )

        // Opdracht 3: Default arguments
        val puzzle03 = AnswerPuzzle(
            setOf(Direction.EAST), "[a42, b1, C42, D2]", """
                Copy & paste onderstaande functies ergens in je client:
                
                fun foo(name: String, number: Int, toUpperCase: Boolean) =
                        (if (toUpperCase) name.uppercase() else name) + number

                fun useFoo() = listOf(
                        foo("a"),
                        foo("b", number = 1),
                        foo("c", toUpperCase = true),
                        foo(name = "d", number = 2, toUpperCase = true)
                )
                
                Copy & paste onderstaand statement in je main() om de puzzel op te lossen:
                
                ApiSync.solve(mazeId, useFoo().toString())
                
                Stel je de volgende code in Java voor, welke gebruik maakt van overloading:
                
                // VOORBEELD
                public String foo(String name, int number, boolean toUpperCase) {
                    return (toUpperCase ? name.toUpperCase() : name) + number;
                }
                public String foo(String name, int number) {
                    return foo(name, number, false);
                }
                public String foo(String name, boolean toUpperCase) {
                    return foo(name, 42, toUpperCase);
                }
                public String foo(String name) {
                    return foo(name, 42);
                }
                
                Wijzig de declaratie van de functie foo() zodat deze op dezelfde manier overloading toepast als in het Java 
                voorbeeld. Bekijk eventueel ook de Kotlin default arguments syntax (https://kotlinlang.org/docs/functions.html#default-arguments) 
                als je er niet uitkomt.
            """.trimIndent(),
            "Je hebt de opdracht opgelost. Je kunt nu verder naar het oosten voor je volgende opdracht."
        )
        infos.add(
            PositionInfo(
                Position(3, 0),
                setOf(Direction.WEST),
                "Opdracht 3: Default arguments",
                puzzle = puzzle03
            )
        )


        infos.add(
            PositionInfo(
                Position(0, 16),
                setOf(Direction.WEST),
                "Nu ben je hopelijk iets wijzer geworden over Kotlin. Dit is de code voor het volgende level: 1be61571-828f-4a18-b318-54cabac31412",
                true
            )
        )
        return infos
    }
}



