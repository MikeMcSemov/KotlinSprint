package org.example.lesson_10

fun main() {

    println("Введите длину кода:")
    generationCode(readln().toInt())

}

fun generationCode(leightCode: Int?) {

    val listCode = mutableListOf<String?>()
    val charRange = '!'..'/'
    val intRange = 0..9

    for (i in 0 until leightCode!!) {

        if (i % 2 == 0) {
            listCode.add(intRange.random().toString())
        } else {
            listCode.add(charRange.random().toString())
        }
    }

    listCode.forEach { print(it) }

}
