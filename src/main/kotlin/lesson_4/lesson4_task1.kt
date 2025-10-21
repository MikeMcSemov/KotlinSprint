package org.example.lesson_4

const val NUMBER_OF_TABLE = 13

fun main() {

    val tablesAreBookedToday = 13
    val tablesAreBookedTomorrow = 9

    println("Доступность столиков на сегодня: ${tablesAreBookedToday < NUMBER_OF_TABLE}")
    println("Доступность столиков на сегодня: ${tablesAreBookedTomorrow < NUMBER_OF_TABLE}")
}
