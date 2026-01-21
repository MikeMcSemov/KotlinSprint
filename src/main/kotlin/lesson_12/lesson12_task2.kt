package org.example.lesson_12

fun main(){
    val weatherOneDayNew = WeatherOneDayNew(25, 15, true)

    weatherOneDayNew.printWeather()
}

class WeatherOneDayNew(
    val temperatureDay: Int,
    val temperatureNight: Int,
    val precipitationPerDay: Boolean,
) {

    fun  printWeather() {
        println("Температура днем: $temperatureDay, Температура ночью: $temperatureNight, Наличие осадков: $precipitationPerDay")
    }
}
