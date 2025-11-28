package org.example.lesson_9

fun main() {

    val mutableSetIngridients = mutableSetOf<String>()

    println("Введите название 5 ингредиентов")

    for (i in 0 until 5) {
        mutableSetIngridients.add(readln())
    }

    val mutableListIngridientSorted = mutableSetIngridients.sorted()

    println(mutableListIngridientSorted.joinToString(", ").replaceFirstChar { it.uppercase() })

}
