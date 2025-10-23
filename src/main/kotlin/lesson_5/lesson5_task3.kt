package org.example.lesson_5

import java.util.Scanner

const val FIRST_DIGIT_RIGHT = 1
const val SECOND_DIGIT_RIGHT = 41

fun main() {

    val scanner = Scanner(System.`in`)

    println("Необходимо угадать два числа от 0 до 42")
    println("Введите 1 число:")
    val firstDigitUser = scanner.nextInt()
    println("Введите 2 число:")
    val secondDigitUser = scanner.nextInt()

    if (((firstDigitUser == FIRST_DIGIT_RIGHT) || (firstDigitUser == SECOND_DIGIT_RIGHT)) && ((secondDigitUser == SECOND_DIGIT_RIGHT) || (secondDigitUser == FIRST_DIGIT_RIGHT))) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (((firstDigitUser == FIRST_DIGIT_RIGHT) || (firstDigitUser == SECOND_DIGIT_RIGHT)) || ((secondDigitUser == SECOND_DIGIT_RIGHT) || (secondDigitUser == FIRST_DIGIT_RIGHT))) {
        println("Вы выиграли утешительный приз! Загаданные числа были $FIRST_DIGIT_RIGHT и $SECOND_DIGIT_RIGHT")
    } else {
        println("Неудача! Загаданные числа были $FIRST_DIGIT_RIGHT и $SECOND_DIGIT_RIGHT")
    }

}
