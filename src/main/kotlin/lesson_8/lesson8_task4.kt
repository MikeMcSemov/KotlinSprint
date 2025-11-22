package org.example.lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("огурцы", "салат", "лук", "булочка", "кунжут")
    println(arrayOfIngredients.joinToString())

    println("Какой ингредиент хотите заменить:")
    val ingridientUserChange = readln()

    if (ingridientUserChange in arrayOfIngredients) {
        println("Какой ингредиент хотите добавить:")
        val ingridientUserAdd = readln()

        val indexIngridient = arrayOfIngredients.indexOf(ingridientUserChange)
        arrayOfIngredients[indexIngridient] = ingridientUserAdd
        println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.joinToString()}")
    } else
        println("Такого ингредиента нет, повторите заново")
}
