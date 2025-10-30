package org.example.lesson_4

    const val NUMBER_OF_CREW_MIN = 55
    const val NUMBER_OF_CREW_MAX = 70
    const val QUANTITY_OF_PROVISIONS = 50

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

    val result = if ((damageToTheShip && (numberOfCrew in NUMBER_OF_CREW_MIN..NUMBER_OF_CREW_MAX) && (quantityOfProvisions > QUANTITY_OF_PROVISIONS))
        || (!damageToTheShip && (numberOfCrew == NUMBER_OF_CREW_MAX) && (quantityOfProvisions >= QUANTITY_OF_PROVISIONS) && weatherIsGood))
        "может" else "не может"

    println("Научно-исследовательский корабль $result приступить к долгосрочному плаванию")

}
