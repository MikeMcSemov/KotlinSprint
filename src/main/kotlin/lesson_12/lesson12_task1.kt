package org.example.lesson_12

fun main() {
    val weatherOneDay1 = WeatherOneDay()
    val weatherOneDay2 = WeatherOneDay()

    weatherOneDay1.temperatureDay = 25
    weatherOneDay1.temperatureNight = 12
    weatherOneDay1.precipitationPerDay = true

    weatherOneDay1.printWeather()

    weatherOneDay2.temperatureDay = 16
    weatherOneDay2.temperatureNight = 5

    weatherOneDay2.printWeather()
}

class WeatherOneDay {
    var temperatureDay: Int = 666
    var temperatureNight: Int = 666
    var precipitationPerDay: Boolean = false

    fun printWeather() {
        println("Температура днем: $temperatureDay, Температура ночью: $temperatureNight, Наличие осадков: $precipitationPerDay")
    }
}
