package org.example.lesson_12

import kotlin.random.Random

fun main() {
    val rangeTemperatureForDay = 1..35
    val listWeatherForMonth = List(30) {
        WeatherForMonth(
            rangeTemperatureForDay.random(), rangeTemperatureForDay.random(),
            Random.nextBoolean()
        )
    }

    println("Количество дней с осадками: ${listWeatherForMonth.filter { it.precipitationPerDay }.size}")
    println("Среднее значение дневных температур: ${listWeatherForMonth.map { it.temperatureOfDay }.average()}")
    println("Среднее значение ночных температур: ${listWeatherForMonth.map { it.temperatureOfNight }.average()}")
}

class WeatherForMonth(
    val temperatureOfDay: Int,
    val temperatureOfNight: Int,
    val precipitationPerDay: Boolean,
)
