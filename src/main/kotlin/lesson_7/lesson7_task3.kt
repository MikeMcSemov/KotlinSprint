package org.example.lesson_7

fun main() {

    println("Введите целое число:")
    val digitUser: Int = readln().toInt()

    println("Четные числа от 0 до $digitUser:")
    for (i in 0..digitUser) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}
