package org.example.lesson_6

import kotlin.random.Random

fun main() {

    var counter = 3
    var resultSumm: Int

    println(
        """
        Докажите, что вы не бот.
        Решите простой математический пример. 
        Сложите два числа:
    """.trimIndent()
    )

    while (counter > 0) {
        val digitFirst = Random.nextInt(0, 9)
        val digitSecond = Random.nextInt(0, 9)

        println("$digitFirst + $digitSecond =")
        println("Введите сумму чисел:")
        resultSumm = readln().toInt()

        when (resultSumm) {
            digitFirst + digitSecond -> {
                println("Добро пожаловать!")
                break
            }

            else -> {
                println("Осталось попыток ${--counter}")
                if (counter == 0) println("Доступ запрещен")
            }
        }
    }
}
