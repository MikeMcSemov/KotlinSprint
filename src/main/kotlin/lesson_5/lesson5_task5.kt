package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val randomList = listOf(Random.nextInt(until = 43), Random.nextInt(until = 43), Random.nextInt(until = 43))

    println("Введите поочередно 3 числа от 0 до 42")
    val numberList = listOf(readln().toInt(), readln().toInt(), readln().toInt())
    val resultList = randomList.intersect(numberList)

    val resultListSize = when (resultList.size) {
        1 -> "Пользователю выплачивается утешительный приз!"
        2 -> "Пользователь угадал два числа и получает крупный приз!"
        3 -> "Пользователь угадал все числа и выиграл джекпот!"
        else -> "пользователь не угадал ни одного числа"
    }

    println(resultListSize)
    println("Выигрышные числа: $resultList")

}
