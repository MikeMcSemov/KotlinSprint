package org.example.lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("огурцы", "салат", "лук", "булочка", "кунжут")

    println("Введите ингредиент:")
    val ingredientPrintUser = readln()

    for (i in arrayOfIngredients) {
        if (i == ingredientPrintUser) {
            println("Ингредиент $i в рецепте есть")
            break
        }
    }

    if (arrayOfIngredients.last() != ingredientPrintUser) {
        println("Такого ингредиента в рецепте нет")
    }

}
