# workshop-kotlin

## Opzetten workspace
Onderstaande handleiding is gemaakt voor een IntelliJ IDEA workspace. Het is handig dat je minimaal support hebt voor Kotlin en 
Gradle. Mocht je deze plugins/functionaliteit niet aan hebben staan, doe dit dan alsnog en herstart je IDE.

### Repository clonen
Clone de volgende repo naar een map op je lokale schijf: https://github.com/avdrovaart/workshop-kotlin.git

### Nieuw Gradle project maken
Het workshop-kotlin project is een Gradle project. Let hierop bij het aanmaken van je IntelliJ project!

* Ga in IntelliJ naar File > New > Project from existing sources...
* Kies de map waar je de workshop-kotlin gecloned hebt
* Kies in de volgende stap bij het importeren van external model voor 'Gradle'
* Klik op Finish

## Instructie
In deze workshop ga je puzzels oplossen in de vorm van een doolhof. De applicatie is een client/server-model, en je kunt door 
de doolhoven navigeren door commando's te sturen naar de server.

### Server
De server hoef je enkel eenmalig te starten en deze onthoudt je state. Het is voor deze workshop niet nodig om aanpassingen
te maken in de server (ook niet stiekem spieken naar de source!). De server start je door rechtsboven in je run configuration 
'ServerKt' te selecteren en op run (groene pijltje) te klikken. Je workspace bouwen met Gradle is niet nodig.

### Client
De aanpassingen voor deze server maak je uitsluitend in de client. De client staat in ``client/src/main/kotlin/client/Client.kt``.
De client run je door rechtsboven in je run configuration 'ClientKt' te selecteren en op run (groene pijltje) te klikken.

Nog een aantal pointers om je op weg te helpen:
* Er zijn meerdere levels (ook wel mazes genoemd). Elk level heeft zijn eigen UUID. Aan het begin van de client kun je het UUID van 
het level meegeven. We hebben het UUID van het eerste level alvast ingevuld. Bij het behalen van een level krijg je een nieuw UUID
van het volgende level.
* Gebruik de ```printInfo()``` methode om handig de output van de server naar je console te laten printen.
* De server ondersteunt de volgende API calls:
  * ```move()``` - hiermee beweeg je door het doolhof
  * ```use()``` - hiermee gebruik je een item
  * ```solve()``` - hiermee los je een puzzel op/geef je een wachtwoord in
  * ```getCurrentPosition()``` - hiermee haal je je huidige positie op binnen het doolhof
  * ```resetMaze()``` - hiermee reset je de state van de server (handig als je bijv. vast zit)
* Sommige levels hebben stamina. Dit houdt in dat je maximaal aantal stappen beperkt zijn. Kies je route dus wijselijk!

Was dit teveel informatie? Maak je niet druk! De server helpt je vaak ook een handje op weg hoe je de API calls moet gebruiken.

### Hoe nu verder?
Doel van de workshop is om alle doolhoven op te lossen. Sommige zijn makkelijker dan andere. Je kunt natuurlijk elk doolhof brute
forcen (en in het ergste geval zelfs in Java). Echter, probeer zoveel mogelijk slimme functies te programmeren in Kotlin om uit 
de doolhoven te komen.

Mocht je echt helemaal onbekend zijn met Kotlin, dan staat hier een kleine introductie en cheat sheet:
* https://kotlinlang.org/docs/basic-syntax.html#print-to-the-standard-output
* https://devhints.io/kotlin

Voor vragen kun je terecht bij Alexander, Joshua of Bas.