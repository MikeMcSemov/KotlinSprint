package org.example.lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("огурцы", "салат", "лук", "булочка", "кунжут")
    println(arrayOfIngredients.joinToString())

    println("Какой ингредиент хотите заменить:")
    val ingridientUserChange = readln()

    val indexIngridient = arrayOfIngredients.indexOf(ingridientUserChange)

    if (indexIngridient >= 0) {
        println("Какой ингредиент хотите добавить:")
        arrayOfIngredients[indexIngridient] = readln()
        println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.joinToString()}")
    } else println("Такого ингредиента нет, повторите заново")
}
