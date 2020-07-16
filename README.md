# Gorilla-Game
This project is structure of a possible Gorilla Game.
Project required to create class for the game such as Gorilla, Banana, Building, Map and others.
Project required to include inheritance, overriding and overloading at least once.


In my project I created classes: Gorilla, Player, Map, Banana, Building.

Banana class describes the properties of a banana - main weapon of the game - angle and velocity.

Gorilla abstract class describes the properties and methods of a Gorilla, like its location. Gorilla's methods include
Attack, Dance, Dance. Attack method is responsible for creating a new Banana with velocity and angle. First dance method
is responsible for dancing animation when Banana hits another player. Second dance method is responsible for dancing animation
when player wins the game. This is example of Overloading.

Player class extends Gorilla and inherits its properties and methods. This is example of inheritance. Additionally,
Player has player Number and player score.

Building class describes basic building properties like height, width and colour. 

Map class describes Game map and consists of ArrayList of buildings and world boundaries.

Game class is responsible for running the game. It has 2 players and a city (map). Its method runGame is responsible for starting the game 
registering hits, calculating score and determining the winner.


This is very basic possible structure of Gorilla Game.
