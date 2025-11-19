package org.example.lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("огурцы", "салат", "лук", "булочка", "кунжут")

    println("Введите ингредиент:")
    val userIngredient = readln()

    for (i in arrayOfIngredients) {
        if (i == userIngredient) {
            println("Ингредиент $i в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")

}
