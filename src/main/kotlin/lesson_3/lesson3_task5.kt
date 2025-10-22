package org.example.lesson_3

fun main() {

    val allOfTheMove = "D2-D4;0"

    val allOftheMoveParts = allOfTheMove.split("-", ";")
    val startOfTheMove = allOftheMoveParts[0]
    val endOfTheMove = allOftheMoveParts[1]
    val numberOfTheMove = allOftheMoveParts[2]

    println(startOfTheMove)
    println(endOfTheMove)
    println(numberOfTheMove)

}
