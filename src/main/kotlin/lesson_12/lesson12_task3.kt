package org.example.lesson_12

fun main() {
    val weatherOneDayNewNew = WeatherOneDayNewNew(300, 290)

    weatherOneDayNewNew.printWeather()
}

class WeatherOneDayNewNew(
    kelvinDayTemperature: Int,
    kelvinNightTemperature: Int,
) {
    val kelvinDayTemperature = kelvinDayTemperature
    val kelvinNightTemperature = kelvinNightTemperature
    val precipitationPerDay: Boolean = false

    fun printWeather() {
        println("Температура днем: ${(kelvinDayTemperature - 273.15).toInt()}, Температура ночью: ${(kelvinNightTemperature - 273.15).toInt()}, Наличие осадков: $precipitationPerDay")
    }
}
