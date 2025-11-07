package org.example.lesson_7

fun main() {

    val listPassword: MutableList<String> = mutableListOf()

    for (i in 1..6) {
        if (i % 2 != 0) {
            val rangeChar = ('a'..'z').random().toString()
            listPassword.add(i - 1, rangeChar)

        } else {
            val rangeDigit = (0..9).random().toString()
            listPassword.add(i - 1, rangeDigit)
        }
    }

    val listPasswordPrint = listPassword.joinToString()
    println(listPasswordPrint)
}
