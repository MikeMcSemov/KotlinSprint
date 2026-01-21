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


class WeatherOneDay
{
    var temperatureDay: Int = 666
    var temperatureNight: Int = 666
    var precipitationPerDay: Boolean = false

    fun  printWeather() {
        println("Температура днем: $temperatureDay, Температура ночью: $temperatureNight, Наличие осадков: $precipitationPerDay")
    }
}

/*
Создай два объекта, присвой им произвольные данные и выведи в консоль одним методом созданного класса.

- в классе создай переменные и проинициализируй их какими-нибудь значениями;
- затем в созданных объектах подставь другие значения этим переменным.
 */