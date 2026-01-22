package org.example.lesson_12

fun main() {
    val weatherOneDayNewNewNew = WeatherOneDayNewNewNew(300, 290)
}

class WeatherOneDayNewNewNew(temperatureDay: Int, temperatureNight: Int) {

    var precipitationPerDay: Boolean = false

    init {
        println("Day ${(temperatureDay - 273.15).toInt()} Night ${(temperatureNight - 273.15).toInt()} Precipitation $precipitationPerDay")
    }
}
