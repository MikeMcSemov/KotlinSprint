package org.example.lesson_10

import kotlin.random.Random

fun main() {

    val userRollDice = rollDice()
    val computerRollDice = rollDice()

    println("У игрока выпало на кубиках: $userRollDice")
    println("У компьютера выпало на кубиках: $computerRollDice")

    if (userRollDice > computerRollDice) println("Победило человечество")
    else if (userRollDice < computerRollDice) println("Победила машина")
    else println("Победила дружба")
}

fun rollDice(): Int {

    return Random.nextInt(1, 7)

}
