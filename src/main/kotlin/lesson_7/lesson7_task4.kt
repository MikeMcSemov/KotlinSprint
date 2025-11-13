package org.example.lesson_7

const val FROM_SEC_IN_MSEC = 1000L

fun main() {

    println("Введите количество секунд, которые нужно засечь:")

    val digitTimer = readln().toInt()

    for (i in 0..digitTimer) {
        Thread.sleep(FROM_SEC_IN_MSEC)
        println(i)
    }

    println("Время вышло")
}
