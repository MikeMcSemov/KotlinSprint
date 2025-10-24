package org.example.lesson_4

import java.util.Scanner

fun main() {

    var damageToTheShip: Boolean
    val numberOfCrew: Int
    val quantityOfProvisions: Int
    val weatherIsGood: Boolean
    val scanner = Scanner(System.`in`)

    println("Наличие повреждений корпуса:")
    damageToTheShip = scanner.nextBoolean()

    println("Текущий состав экипажа:")
    numberOfCrew = scanner.nextInt()

    println("Количество ящиков с провизией на борту:")
    quantityOfProvisions = scanner.nextInt()

    println("Благоприятность метеоусловий:")
    weatherIsGood = scanner.nextBoolean()

    val result = if ((damageToTheShip && (numberOfCrew in 55..70) && (quantityOfProvisions > 50))
        || (!damageToTheShip && (numberOfCrew == 70) && (quantityOfProvisions >= 50) && weatherIsGood))
        "может" else "не может"

    println("Научно-исследовательский корабль $result приступить к долгосрочному плаванию")

}
