package org.example.lesson_10

import kotlin.random.Random

fun main() {

    println("Введите длину кода:")
    generationCode(readln().toInt())

}

fun generationCode(leightCode: Int?) {

    val listCode = mutableListOf<String?>()
    val charRangeInt = '!'..'/'

    for (i in 0 until leightCode!!) {

        if (i % 2 == 0) {
            listCode.add(Random.nextInt(9).toString())
        } else {
            listCode.add(charRangeInt.random().toString())
        }
    }

    listCode.forEach { print(it) }

}
