package org.example.lesson_8

fun main() {

    val arrayOfShowInWeek = arrayOf(120, 540, 430, 385, 621, 809, 256)
    var sumShowInWeek = 0

    for (i in 1..arrayOfShowInWeek.size) {
        sumShowInWeek += arrayOfShowInWeek[i - 1]
    }

    println(sumShowInWeek)

}
