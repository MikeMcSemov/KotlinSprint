package org.example.lesson_9

fun main() {

    val listIngridients = listOf("огурцы", "салат", "лук", "булочка", "кунжут")

    println("В рецепте есть следующие ингредиенты: $listIngridients")

    listIngridients.forEach {
        println(it)
    }
}
