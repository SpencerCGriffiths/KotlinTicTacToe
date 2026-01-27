package org.example

import kotlin.random.Random

fun main() {
    println("Hello World!")

    var availableBoardSpaces: MutableList<Int> = mutableListOf(1,2,3,4,5,6,7,8,9)

    var restartGame: Boolean = false

    if (!restartGame) {
        //print Instructions -> function
        printInstructions()
    }
    //If restartGames == true Skip instructions


    // Start Game method

    //Game Loop
    do {
        playersTurn()
        availableBoardSpaces = computersTurn(availableBoardSpaces)
    } while (matchesWinningState(board = TODO(), winningState = TODO()))

    //Restart Game? -> set to true and recurse
    endGame()
}

fun printInstructions() {
    print(gameInstructions)
}

fun matchesWinningState(
    board: Map<Int, Int>,
    winningState: Map<Int, Int>
): Boolean {
    return winningState.all { (square, value) ->
        board[square] == value
    }
}


fun gamePlay() {

    fun computersTurn(availableBoardSpaces: MutableList<Int>): Boolean {
        val randomAvailableSpace = availableBoardSpaces.random()
        availableBoardSpaces.remove(randomAvailableSpace)
        if (matchesWinningState(board = TODO(), winningState = TODO())) {
            return endGame()
        } else {
            playersTurn()
        }
    }

    fun playersTurn(): Boolean {
        TODO()
        if (matchesWinningState(board = TODO(), winningState = TODO())) {
            return endGame()
        } else {
            computersTurn()
        }
    }

    fun checkState(availableBoardSpaces: MutableList<Int>, gameTurn: (MutableList<Int>) -> Boolean): Boolean {
        if (matchesWinningState(board = TODO(), winningState = TODO())) {
            return endGame()
        } else {
            gameTurn(availableBoardSpaces)
        }
    }

    playersTurn()
}

//1 -> o
//2 -> o
//3 -> o
//
//1 -> x
//2 -> x
//
//
//list of available spaces:
//        0..100

// 1, 2, 3, 4, 0, 6, 7, 8, 9
// 0, 1, 2, 3, 4, 5, 6, 7, 8


// Game start: mutableBoardList contains string of positions
// Player move: player picks a position of mutableBoardList
// Update board: remove the index of position (which is position - 1) from availableIndexes, which is a List<Int>
// Check board: check for game winning state
// Computer move: pick a random value from availableIndexes
// Update board: remove the index of position (which is position - 1) from availableIndexes
// Player move: player picks a position of mutableBoardList
// ...

val mutableList: MutableList<String> = mutableListOf("1", "X", "3", "X", "O", "6", "O", "8", "9")
val availableIndexes = mutableListOf(1, "3", "6", "8", "9")
val availableIndex = mutableList.random().
mutableList.set(availableIndex, "X")

fun endGame(): Boolean {
    // Check board <- could this be done before this method? fun checkGameState()?
    // print the outcome
    // ask if want to try again
    // return boolean
    return true
}


fun printBoard(mutableList: MutableList<String>) {
    println("| ${mutableList.get(0)} | ${mutableList.get(2)} | ${mutableList.get(3)} |")
    println("| ${mutableList.get(4)} | ${mutableList.get(5)} | ${mutableList.get(6)} |")
    println("| ${mutableList.get(7)} | ${mutableList.get(8)} | ${mutableList.get(9)} |")
}

val gameInstructions: String = "" +
        "Welcome to the ultimate Tic Tac Toe!!" +
        "When prompted to start the game press any key to begin" +
        "You get to go first. To select a square for your X enter a number between 1 and 9 which correlates to the grid. For example 1 is the top left corner whilst 9 is the bottom right" +
        "| 1 | 2 | 3 |" +
        "| 4 | 5 | 6 |" +
        "| 7 | 8 | 9 |" +
        "Once your square has been selected you will see the board with your space filled in e.g. after selecting 1 you would see" +
        "| X | 2 | 3 |" +
        "| 4 | 5 | 6 |" +
        "| 7 | 8 | 9 |" +
        "After you have had a turn the computer will select a square themselves and this will be filled with an O" +
        "The aim of the game is to match three X's in a row either vertical, horizontal or diagonal to win the game. Make sure to block the O from doing the same or they will win before you" +
        "Good Luck!"