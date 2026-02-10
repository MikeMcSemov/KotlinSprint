package org.example.lesson_12

fun main() {
    val weatherDay = WeatherDay(300, 290)
}

class WeatherDay(
    val temperatureDay: Int,
    val temperatureNight: Int,
) {
    val precipitationPerDay: Boolean = false

    init {
        println("Day ${(temperatureDay - 273.15).toInt()} Night ${(temperatureNight - 273.15).toInt()} Precipitation $precipitationPerDay")
    }
}
