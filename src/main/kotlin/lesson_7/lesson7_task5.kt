package org.example.lesson_7

fun main() {

    val listPassword: MutableList<Char> = mutableListOf()
    val rangeSum = ('a'..'z') + ('A'..'Z') + ('0'..'9')

    println("Введите длину кода, минимальное количество 6:")
    val sizeCode = readln().toInt()

    listPassword.add(('a'..'z').random())
    listPassword.add(('A'..'Z').random())
    listPassword.add(('0'..'9').random())

    for (i in 4..sizeCode) {
        listPassword.add(rangeSum.random())
    }

    listPassword.shuffle()
    println(listPassword.joinToString())
}
