package org.example.lesson_6

const val COEF_FROM_MSEC_IN_SEC = 1000

fun main() {

    println("Введите количество секунд, которые нужно засечь")
    val numberOfSeconds = readln().toLong()
    var counter = numberOfSeconds

    while (counter <= numberOfSeconds && counter > 0) {
        println("Осталось секунд: $counter")
        counter--
        Thread.sleep(COEF_FROM_MSEC_IN_SEC.toLong())
    }

    println("Время вышло")

}
