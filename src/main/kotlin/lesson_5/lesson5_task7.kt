package org.example.lesson_5

    const val COEFFICIENT_TRAVEL_DISTANCE = 100

fun main() {

    println("Введите расстояние поездки (в километрах):")
    val travelDistanceInKm = readln().toFloat()

    println("Введите расход топлива на 100 км (в литрах):")
    val fuelConsumption = readln().toFloat()

    println("Введите текущую цену за литр топлива:")
    val pricePerLiter = readln().toFloat()

    val totalLitersOfFuel = (travelDistanceInKm * fuelConsumption) / COEFFICIENT_TRAVEL_DISTANCE
    val totalCostOfFuel = totalLitersOfFuel * pricePerLiter

    println("Общее количество необходимого топлива: %.2f и итоговая стоимость поездки составляет: %.2f".format(totalLitersOfFuel, totalCostOfFuel))

}
