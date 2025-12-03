package org.example.lesson_10

fun main() {

    val userRollDice = rollDiceNew()
    val computerRollDice = rollDiceNew()

    println("У игрока выпало на кубиках: $userRollDice")
    println("У компьютера выпало на кубиках: $computerRollDice")

    if (userRollDice > computerRollDice) println("Победило человечество")
    else if (userRollDice < computerRollDice) println("Победила машина")
    else println("Победила дружба")
}

fun rollDiceNew(): Int {

    val rangeDigit = 1..6

    return rangeDigit.random()

}