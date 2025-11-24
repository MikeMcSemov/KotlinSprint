package org.example.lesson_9

fun main() {

    println("Введите пять названий ингредиентов в одной строке, разделяя их запятыми (с пробелом)")

    val strIngridients = readln()
    val resIngridient = strIngridients.split(", ", limit = 5)

    println(resIngridient.sorted())

}
