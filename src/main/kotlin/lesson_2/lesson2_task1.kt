package org.example.lesson_2

fun main() {
    val numberOfStudents = 4
    val englishGrade = listOf(3.0, 4.0, 3.0, 5.0)

    val averageScore = englishGrade.sum() / numberOfStudents
    println(averageScore)
}
