package org.example.lesson_3

fun main() {

    var startOfTheMove = "E2"
    var endOfTheMove = "E4"
    var numberOfTheMove = 1
    var allOfTheMove = "$startOfTheMove-$endOfTheMove;$numberOfTheMove"

    println(allOfTheMove)

    startOfTheMove = "D2"
    endOfTheMove = "D3"
    numberOfTheMove++
    allOfTheMove = "$startOfTheMove-$endOfTheMove;$numberOfTheMove"

    println(allOfTheMove)
}
