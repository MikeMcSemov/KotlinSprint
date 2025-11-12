package org.example.lesson_7

fun main() {

    val listPassword: MutableList<String> = mutableListOf()
    val rangeChar = 'a'..'z'
    val rangeDigit = 0..9

    for (i in 1..6) {
        if (i % 2 != 0) {
            listPassword.add(i - 1, rangeChar.random().toString())

        } else {
            listPassword.add(i - 1, rangeDigit.random().toString())
        }
    }

    val listPasswordPrint = listPassword.joinToString()
    println(listPasswordPrint)
}
