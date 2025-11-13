package org.example.lesson_7

fun main() {

    val rangeInt = 1000..9999

    do {
        val rangeIntRandom = rangeInt.random()

        println("Ваш код авторизации: № $rangeIntRandom")
        println("Введите код авторизации: №")

        val codeUser: Int = readln().toInt()
    } while (rangeIntRandom != codeUser)

    println("Добро пожаловать!")

}
