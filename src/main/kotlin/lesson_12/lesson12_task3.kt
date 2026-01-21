package org.example.lesson_12

fun main(){
    val weatherOneDayNewNew = WeatherOneDayNewNew()

    weatherOneDayNewNew.temperatureDay = 300
    weatherOneDayNewNew.temperatureNight = 290

    weatherOneDayNewNew.printWeather()
}


class WeatherOneDayNewNew() {
    var temperatureDay: Int = 500
    var temperatureNight: Int = 450
    var precipitationPerDay: Boolean = false

    fun  printWeather() {
        println("Температура днем: ${(temperatureDay - 273.15).toInt()}, Температура ночью: ${(temperatureNight - 273.15).toInt()}, Наличие осадков: $precipitationPerDay")
    }
}
