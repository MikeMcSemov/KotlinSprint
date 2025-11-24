package org.example.lesson_9

fun main() {

    val mutableListIngridients = mutableListOf("огурец", "салат", "лук")

    println("В рецепте есть базовые ингредиенты: $mutableListIngridients")

    println("Желаете добавить еще?")
    val userDataConsole = readln()

    if (userDataConsole.equals("Да")) {
        println("Какой ингредиент вы хотите добавить?")
        mutableListIngridients.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: $mutableListIngridients")

    } else return

}
