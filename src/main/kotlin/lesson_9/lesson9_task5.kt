package org.example.lesson_9

fun main() {

    val mutableListIngridients = mutableListOf<String>()

    println("Введите название 5 ингредиентов")

    for (i in 0 until 5) {
        mutableListIngridients.add(readln())
    }

    val mutableListIngridientSorted = mutableListIngridients.distinct().sorted()

    println(
        mutableListIngridientSorted.joinToString(", ")
            .replaceFirst(mutableListIngridientSorted[0], mutableListIngridientSorted[0].uppercase())
    )

}
