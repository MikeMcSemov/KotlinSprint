package org.example.lesson_9

fun main() {

    val listOmeletForOnePerson = listOf(2, 50, 15)

    println("Введите количество порций:")
    val numberOfServings = readln().toInt()

    val listOmeletForSeveralPerson = listOmeletForOnePerson.map {
        it * numberOfServings
    }

    println("На $numberOfServings порций вам понадобится: Яиц – ${listOmeletForSeveralPerson[0]} шт, молока – ${listOmeletForSeveralPerson[1]} мл, сливочного масла – ${listOmeletForSeveralPerson[2]} гр")

}
