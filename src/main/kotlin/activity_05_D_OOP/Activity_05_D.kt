package activity_05_D_OOP

//Coverage : OOP Inheritance, Encapsulation, Polymorphism, Abstraction
//You are tasked to create a game.
//The game is snake and ladders.
//Identify and create the class that will be needed to implement Snakes and ladders.
//Hint:
//You will need an array to represent the board.
//You will need snakes, ladders and players.
//Use all OOP concepts.

interface Board {
    var tiles: Int

    fun resetBoard()
    fun newGame()
    fun RandomizeStartEndLaddersSnakes()
}

class SnakeAndLadderBoard(override var tiles: Int = 10 ) : Board {
    override fun resetBoard() {
        TODO("Not yet implemented")
    }

    override fun newGame() {
        TODO("Not yet implemented")
    }

    override fun RandomizeStartEndLaddersSnakes() {
        TODO("Not yet implemented")
    }
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

    fun rollDice() {

    }
}

fun main() {
    var board1= SnakeAndLadderBoard(100)
}