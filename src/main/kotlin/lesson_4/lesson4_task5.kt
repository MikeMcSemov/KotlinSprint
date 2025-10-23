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

    if (((damageToTheShip == true) && (numberOfCrew in 55..70) && (quantityOfProvisions > 50) && ((weatherIsGood == true) || (weatherIsGood == false))) ||
        ((damageToTheShip == false) && (numberOfCrew == 70) && (quantityOfProvisions >= 50) && (weatherIsGood == true))) {
        println("Научно-исследовательский корабль может приступить к долгосрочному плаванию")
    } else {
        println("Научно-исследовательский корабль НЕ может приступить к долгосрочному плаванию")
    }

}
