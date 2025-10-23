package org.example.lesson_5

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println("Введите 1 число:")
    val firstDigit = scanner.nextInt()

    println("Введите 2 число:")
    val secondDigit = scanner.nextInt()

    println("Введите сумму:")
    val result = scanner.nextInt()

    if (result == (firstDigit + secondDigit)) {
        println("Добро пожаловать!")
    } else
        println("Доступ запрещен.")
}
