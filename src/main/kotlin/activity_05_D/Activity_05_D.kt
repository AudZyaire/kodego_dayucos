package activity_05_D

//Coverage : OOP Inheritance, Encapsulation, Polymorphism, Abstraction
//You are tasked to create a game.
//The game is snake and ladders.
//Identify and create the class that will be needed to implement Snakes and ladders.
//Hint:
//You will need an array to represent the board.
//You will need snakes, ladders and players.
//Use all OOP concepts.

class Board {
    var tiles = arrayListOf<Position>()
}

open class GameObject(var start: Position = Position(), var end: Position = Position())



class Snake(start: Position = Position(), end: Position = Position()) : GameObject(start, end)

class Ladder(start: Position = Position(), end: Position = Position()) : GameObject(start, end)


class Player {
    var name: String = ""
    var currentPosition = Position()
}

class Position {
    var x: Int = 0
    var y: Int = 0
}

class Dice {
    var sides = 6
}