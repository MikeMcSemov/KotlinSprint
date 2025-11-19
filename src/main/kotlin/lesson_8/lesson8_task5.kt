package org.example.lesson_8

fun main() {

    println("Количество планируемых ингредиентов:")
    val numberOfIngredients = readln().toInt()

    val arrayIngridients = arrayOfNulls<String>(numberOfIngredients)

    for (i in 0 until numberOfIngredients) {

        println("Введите ингредиент №${i + 1}")
        val ingredientUser = readln()
        arrayIngridients[i] = ingredientUser

    }

    println(arrayIngridients.joinToString())

}
