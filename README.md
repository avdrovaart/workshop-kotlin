# workshop-kotlin

https://play.kotlinlang.org/koans/overview

https://any-api.com/  api-Key nodig?

## Puzzel functionaliteiten
	Server.kt heeft per puzzel de 'map' en hanteert api endpoints:
		- getPosition()
		- move(Direction direction) // enum(Direction.FORWARD, Direction.BACK, Direction.LEFT, Direction.RIGHT)
		- resetPuzzle() // reset puzzle and player to to position 0.0
		- solve(Function answer) // de speler kan weer alle kanten op bewegen 
	
	Client.kt 
		- invulling van de speler	

## Onderwerpen 
	Kotlin Workshop
		1) Client aan de praat krijgen
		
		2) flow control
			- if else
			- for loop
			- switch case
		Puzzel(s):
		2.a) 	vraag positie op, 
			beweeg vooruit,
			vind de uitgang.
		
		5) Collections
			- sequences
			- Operations
		Puzzel(s):
		5.a) 	sla positie op
		
		4) iets met classes
			- nested inner
			- companion objects
			- sealed classes
		Puzzel(s):
		4.a) 	maak player class met een invetory inner class en sla sleutel op
		
		3) functions
			- lambda's
			- inline functions
		Puzzel(s): 
		3.a)	lambda of inline function opsturen om een deur te openen
		
		
		6) async Programming
			- coroutines
		Puzzel(s):
		6.a) 	Twee knoppen tegelijker tijd in drukken. (volatile)
