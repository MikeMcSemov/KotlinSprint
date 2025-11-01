package org.example.lesson_6

import kotlin.random.Random

const val COUNTER = 5

fun main() {

    val digitRandom = Random.nextInt(1, 9)
    var digitUser: Int
    var counter = 0
    println(digitRandom)

    while (counter <= COUNTER) {
        counter++
        println("Попытка №$counter")
        digitUser = readln().toInt()

        if (digitUser == digitRandom) {
            println("Это была великолепная игра!")
            break
        } else if (counter == COUNTER) {
            println("Игра закончена. Было загадано число $digitRandom")
            break
        } else println("Неверно. Осталось ${COUNTER - counter} попыток")
    }

}
