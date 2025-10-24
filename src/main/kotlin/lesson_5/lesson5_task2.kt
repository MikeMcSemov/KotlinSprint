package org.example.lesson_5

import java.util.Scanner

const val AGE_OF_MAJORITY = 18
const val YEAR = 2025

fun main() {

    val scanner = Scanner(System.`in`)

    println("Введите год рождения:")
    val yearOfBirth = scanner.nextInt()

    if ((YEAR - yearOfBirth) >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Тебе еще рано, подожди до 18 лет")
    }

}
