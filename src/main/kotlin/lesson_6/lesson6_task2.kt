package org.example.lesson_6

    const val COEF_FROM_MSEC_IN_SEC1 = 1000

fun main() {

    println("Введите количество секунд, которые нужно засечь")
    val numberOfSeconds = readln().toLong() * COEF_FROM_MSEC_IN_SEC1

    Thread.sleep(numberOfSeconds)

    println("Прошло ${numberOfSeconds / COEF_FROM_MSEC_IN_SEC1} секунд")

}
