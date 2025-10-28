package org.example.lesson_4


fun main() {

    var damageToTheShip: Boolean
    val numberOfCrew: Int
    val quantityOfProvisions: Int
    val weatherIsGood: Boolean

    println("Наличие повреждений корпуса:")
    damageToTheShip = readln().toBoolean()

    println("Текущий состав экипажа:")
    numberOfCrew = readln().toInt()

    println("Количество ящиков с провизией на борту:")
    quantityOfProvisions = readln().toInt()

    println("Благоприятность метеоусловий:")
    weatherIsGood = readln().toBoolean()

    val result = if ((damageToTheShip && (numberOfCrew in 55..70) && (quantityOfProvisions > 50))
        || (!damageToTheShip && (numberOfCrew == 70) && (quantityOfProvisions >= 50) && weatherIsGood))
        "может" else "не может"

    println("Научно-исследовательский корабль $result приступить к долгосрочному плаванию")

}
