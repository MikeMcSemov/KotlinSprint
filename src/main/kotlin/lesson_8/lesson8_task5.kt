package org.example.lesson_8

fun main() {
    println("Количество планируемых ингредиентов:")
    val numberOfIngredients = readln().toInt()
    val arrayIngridients = Array(numberOfIngredients) { "" }

    for (i in arrayIngridients.indices) {
        println("Введите ингредиент №${i + 1}")
        arrayIngridients[i] = readln()
    }

    println(arrayIngridients.joinToString())
}
