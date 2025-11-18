package org.example.lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("огурцы", "салат", "лук", "булочка", "кунжут")

    println("Введите ингредиент:")
    val ingredientPrintUser = readln()

    if (arrayOfIngredients.contains(ingredientPrintUser)) println("Ингредиент $ingredientPrintUser в рецепте есть")
    else println("Такого ингредиента в рецепте нет")

}
