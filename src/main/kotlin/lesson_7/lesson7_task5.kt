package org.example.lesson_7

fun main() {

    val listPassword: MutableList<Char> = mutableListOf()
    val rangeLowercaseLetters = 'a'..'z'
    val rangeCapitalLetters = 'A'..'Z'
    val rangeDigit = '0'..'9'
    val rangeSum = rangeLowercaseLetters + rangeCapitalLetters + rangeDigit

    println("Введите длину кода, минимальное количество 6:")
    val sizeCode = readln().toInt()

    listPassword.add(rangeLowercaseLetters.random())
    listPassword.add(rangeCapitalLetters.random())
    listPassword.add(rangeDigit.random())

    for (i in 4..sizeCode) {
        listPassword.add(rangeSum.random())
    }

    listPassword.shuffle()
    println(listPassword.joinToString())
}
