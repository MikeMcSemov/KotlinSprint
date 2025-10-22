package org.example.lesson_4

const val SUNNY_WEATHER = true
const val TENT_IS_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "не зима"

fun main() {

    val sunnyWeatherToday = true
    val tentIsOpen = true
    val airHumidity = 20
    val season = "зима"

    val comparison = (SUNNY_WEATHER == sunnyWeatherToday) && (TENT_IS_OPEN == tentIsOpen) && (AIR_HUMIDITY == airHumidity) && (SEASON == season)
    println("Благоприятные ли условия сейчас для роста бобовых? $comparison")
}
