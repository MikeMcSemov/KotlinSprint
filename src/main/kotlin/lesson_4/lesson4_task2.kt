package org.example.lesson_4

const val MIN_AVERAGE_KG = 35
const val MAX_AVERAGE_KG = 100
const val AVERAGE_VOLUME = 100

fun main() {

    val firstCargoWeight = 20
    val firstCargoVolume = 80
    val secondCargoWeight = 50
    val secondCargoVolume = 100

    println("Груз с весом $firstCargoWeight кг и объемом $firstCargoVolume л соответствует категории 'Average': ${firstCargoWeight > MIN_AVERAGE_KG && firstCargoWeight <= MAX_AVERAGE_KG && firstCargoVolume < AVERAGE_VOLUME}")
    println("Груз с весом $secondCargoWeight кг и объемом $secondCargoVolume л соответствует категории 'Average': ${secondCargoWeight > MIN_AVERAGE_KG && secondCargoWeight <= MAX_AVERAGE_KG && secondCargoVolume < AVERAGE_VOLUME}")
}
