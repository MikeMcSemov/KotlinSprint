package org.example.lesson_12

import kotlin.random.Random

fun main() {
    val rangeTemperatureForDay = 1..35
    val mutableListWeatherForMonth = mutableListOf <WeatherForMonth> ()

    for (i in 1..30) {
        mutableListWeatherForMonth.add(WeatherForMonth(rangeTemperatureForDay.random(), rangeTemperatureForDay.random(), Random.nextBoolean()))
    }

    println("Количество дней с осадками: ${mutableListWeatherForMonth.filter { it.precipitationPerDay }.size}")
    println("Среднее значение дневных температур: ${mutableListWeatherForMonth.map { it.temperatureOfDay }.average()}")
    println("Среднее значение ночных температур: ${mutableListWeatherForMonth.map { it.temperatureOfNight }.average()}")
}

class WeatherForMonth(
    val temperatureOfDay: Int,
    val temperatureOfNight: Int,
    val precipitationPerDay: Boolean,
)
