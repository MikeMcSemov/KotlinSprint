package org.example.lesson_8

fun main() {

    val arrayOfShowInWeek = arrayOf(120, 540, 430, 385, 621, 809, 256)
    var sumShowInWeek = 0

    for (i in arrayOfShowInWeek.indices) {
        sumShowInWeek += arrayOfShowInWeek[i]
    }

    println(sumShowInWeek)

}
