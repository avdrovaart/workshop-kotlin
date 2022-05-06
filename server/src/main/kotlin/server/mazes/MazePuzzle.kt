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
                VOORBEREIDING:
                Copy & paste onderstaande functie ergens in je client:
                
                fun start(): String = TODO()
                
                Copy & paste onderstaand statement in je main() om de puzzel op te lossen:
                
                ApiSync.solve(mazeId, start())
                
                OPDRACHT:
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
                VOORBEREIDING:
                Copy & paste onderstaande functie ergens in je client:
                
                fun joinOptions(options: Collection<String>) =
                        options.joinToString(TODO())
                
                Copy & paste onderstaand statement in je main() om de puzzel op te lossen:
                
                ApiSync.solve(mazeId, joinOptions(listOf("a", "b", "c")))
                
                OPDRACHT:
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
                VOORBEREIDING:
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
                
                OPDRACHT:
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

        // Opdracht 4: Triple-quoted strings
        val puzzle04 = AnswerPuzzle(
            setOf(Direction.EAST), """#question = life, the universe, and everything
                    #answer = 42""".trimMargin("#"), """
                VOORBEREIDING:
                Copy & paste onderstaande variabele ergens in je client: 
                
                val tripleQuotedString = ""${'"'}
                    #question = life, the universe, and everything
                    #answer = 42""${'"'}.trimIndent()
                
                Copy & paste onderstaand statement in je main() om de puzzel op te lossen:
                
                ApiSync.solve(mazeId, tripleQuotedString)
                
                OPDRACHT:
                Vervang de trimIndent() aanroep met een trimMargin() aanroep, zodat het resultaat geen '#' meer bevat als prefix-teken.
                Bekijk eventueel ook de Kotlin string literals syntax (https://kotlinlang.org/docs/basic-types.html#string-literals) 
                als je er niet uitkomt.
            """.trimIndent(),
            "Je hebt de opdracht opgelost. Je kunt nu verder naar het oosten voor je volgende opdracht."
        )
        infos.add(
            PositionInfo(
                Position(4, 0),
                setOf(Direction.WEST),
                "Opdracht 4: Triple-quoted strings",
                puzzle = puzzle04
            )
        )

        // Opdracht 5: String templates
        val puzzle05 = AnswerPuzzle(
            setOf(Direction.EAST), "\\d{2} (JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC) \\d{4}", """
                VOORBEREIDING:
                Copy & paste onderstaande variabele en functie ergens in je client: 
                
                val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

                fun getPattern() = ""${'"'}\d{2}\.\d{2}\.\d{4}""${'"'}
                
                Copy & paste onderstaand statement in je main() om de puzzel op te lossen:
                
                ApiSync.solve(mazeId, getPattern())
                
                OPDRACHT:
                Triple-quoted strings kunnen ook gebruikt worden voor het maken van regex patterns, bijv. omdat je backslashes niet
                hoeft te escapen. Herschrijf de functie zodat hij een match kan maken met de tekst '13 JUN 1992'. Maak hier gebruik 
                van de 'month' variabele.
            """.trimIndent(),
            "Je hebt de opdracht opgelost. Je kunt nu verder naar het oosten voor je volgende opdracht."
        )
        infos.add(
            PositionInfo(
                Position(5, 0),
                setOf(Direction.WEST),
                "Opdracht 5: String templates",
                puzzle = puzzle05
            )
        )


        // Opdracht 6: Nullable types
        val puzzle06 = AnswerPuzzle(
            setOf(Direction.EAST), "UNKNOWN : Maze", """
                VOORBEREIDING:
                Copy & paste onderstaande code ergens in je client: 
                
                fun sendMessageToClient(
                    client: Client?, message: String
                ): String {
                    TODO()
                }

                class Client(val personalInfo: PersonalInfo?)
                class PersonalInfo(val email: String?)
                
                Copy & paste onderstaand statement in je main() om de puzzel op te lossen:
                
                ApiSync.solve(mazeId, sendMessageToClient(Client(PersonalInfo(null)), "Maze"))
                
                OPDRACHT:
                Herschrijf het stukje Java code uit onderstaand voorbeeld, maar dan in Kotlin, zodat het slechts 1 if() statement bevat.  
                Bekijk eventueel ook de Kotlin syntax voor null safety and safe calls (https://kotlinlang.org/docs/null-safety.html) 
                als je er niet uitkomt.
                
                // VOORBEELD
                public String sendMessageToClient(
                    @Nullable Client client,
                    @NotNull String message,
                ) {
                    if (client == null) return "UNKNOWN : " + message;

                    PersonalInfo personalInfo = client.getPersonalInfo();
                    if (personalInfo == null) return "UNKNOWN : " + message;

                    String email = personalInfo.getEmail();
                    if (email == null) return "UNKNOWN : " + message;
                    
                    return email + " : " + message;
                }
            """.trimIndent(),
            "Je hebt de opdracht opgelost. Je kunt nu verder naar het oosten voor je volgende opdracht."
        )
        infos.add(
            PositionInfo(
                Position(6, 0),
                setOf(Direction.WEST),
                "Opdracht 6: Nullable types",
                puzzle = puzzle06
            )
        )

        // Opdracht 7: Nothing type
        val puzzle07 = AnswerPuzzle(
            setOf(Direction.EAST), "Congrats! Next year you'll be 11.", """
                VOORBEREIDING:
                Copy & paste onderstaande code ergens in je client: 
                
                import java.lang.IllegalArgumentException

                fun failWithWrongAge(age: Int?) {
                    throw IllegalArgumentException("Wrong age: ${"$"}age")
                }
                
                fun checkAge(age: Int?) {
                    if (age == null || age !in 0..150) failWithWrongAge(age)
                    return "Congrats! Next year you'll be ${"$"}{age + 1}."
                }
                
                Copy & paste onderstaand statement in je main() om de puzzel op te lossen:
                
                ApiSync.solve(mazeId, checkAge(10))
                
                OPDRACHT:
                In Kotlin bestaat het 'Nothing' type. Dit kan gebruikt worden voor functies die altijd een Exception gooien. De 
                compipler weet door dit type dat de functie geen return type heeft (zelfs geen Unit). Pas de code uit de voorbereiding
                aan zodat het compileert. Maak hier gebruik van het 'Nothing' type. Bekijk eventueel ook de Kotlin syntax voor 
                het Nothing type (https://kotlinlang.org/docs/exceptions.html#the-nothing-type) als je er niet uitkomt.""".trimIndent(),
            "Je hebt de opdracht opgelost. Je kunt nu verder naar het oosten voor je volgende opdracht."
        )
        infos.add(
            PositionInfo(
                Position(7, 0),
                setOf(Direction.WEST),
                "Opdracht 7: Nothing type",
                puzzle = puzzle07
            )
        )

        // Opdracht 8: Lambdas
        val puzzle08 = AnswerPuzzle(
            setOf(Direction.EAST), "true", """
                VOORBEREIDING:
                Copy & paste onderstaande functie ergens in je client: 
                
                fun containsEven(collection: Collection<Int>): String =
                        collection.any { TODO() }.toString()
                
                Copy & paste onderstaand statement in je main() om de puzzel op te lossen:
                
                ApiSync.solve(mazeId, containsEven(listOf(0, 1, 2)))
                
                OPDRACHT:
                Kotlin ondersteunt functioneel programmeren in de vorm van Lambdas. Geef een lambda expressie mee aan de any() functie
                uit bovenstaande code om te controleren of de Collection een even getal bevat. De any() functie krijgt een predikaat
                mee als argument en retourneert 'true' als minstens een van de elementen aan het predikaat voldoet.
                Bekijk eventueel ook de Kotlin documentatie voor Lambdas 
                (https://kotlinlang.org/docs/lambdas.html#lambda-expressions-and-anonymous-functions) als je er niet uitkomt.""".trimIndent(),
            "Je hebt de opdracht opgelost. Je kunt nu verder naar het oosten..."
        )
        infos.add(
            PositionInfo(
                Position(8, 0),
                setOf(Direction.WEST),
                "Opdracht 8: Lambdas",
                puzzle = puzzle08
            )
        )

        infos.add(
            PositionInfo(
                Position(9, 0),
                setOf(Direction.WEST),
                """
                    Nu ben je hopelijk iets wijzer geworden over Kotlin. Als je nog meer puzzels wilt doen, ga dan naar: 
                    https://play.kotlinlang.org/koans/. Dit is de code voor het volgende level: 1be61571-828f-4a18-b318-54cabac31412""".trimIndent(),
                true
            )
        )
        return infos
    }
}



