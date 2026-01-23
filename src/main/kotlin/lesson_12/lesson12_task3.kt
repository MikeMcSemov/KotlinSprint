package org.example.lesson_12

fun main() {
    val weatherOneDayNewNew = WeatherOneDayNewNew(300, 290)

    weatherOneDayNewNew.printWeather()
}

class WeatherOneDayNewNew(
    kelvinDayTemperature: Int,
    kelvinNightTemperature: Int,
) {
    private val kelvinToCelsiusOffset = 273.15
    val dayTemperature = kelvinDayTemperature - kelvinToCelsiusOffset
    val nightTemperature = kelvinNightTemperature - kelvinToCelsiusOffset
    val precipitationPerDay: Boolean = false

    fun printWeather() {
        println(
            """
            Температура днем: ${dayTemperature.toInt()}
            Температура ночью: ${nightTemperature.toInt()}
            Наличие осадков: $precipitationPerDay
        """.trimIndent()
        )
    }
}
