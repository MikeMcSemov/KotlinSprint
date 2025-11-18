package org.example.lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("огурцы", "салат", "лук", "булочка", "кунжут")

    println("Введите ингредиент:")
    val userIngredient = readln()

    if (userIngredient in arrayOfIngredients) println("Ингредиент $userIngredient в рецепте есть")
    else println("Такого ингредиента в рецепте нет")

}
