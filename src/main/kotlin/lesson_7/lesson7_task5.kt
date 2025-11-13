package org.example.lesson_7


fun main() {

    val listPassword: MutableList<Char> = mutableListOf()
    val rangeCharSmall = 'a'..'z'
    val rangeCharBig = 'A'..'Z'
    val rangeDigit = '0'..'9'

    println("Введите длину кода, минимальное количество 6:")
    val sizeCode = readln().toInt()

    val rangeChar = listOf(rangeCharSmall.random(), rangeCharBig.random(), rangeDigit.random())

    for (i in 1..sizeCode) {
        listPassword.add(rangeChar.random())
    }

    println(listPassword.joinToString())
}
