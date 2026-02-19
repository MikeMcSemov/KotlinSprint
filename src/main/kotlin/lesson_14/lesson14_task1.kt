package org.example.lesson_14

fun main() {
    val liner = ShipLiner()
    liner.printShip()
    liner.isChopIce()

    println()

    val cargo = CargoShip("Грузовой", 40, 70)
    cargo.printShip()
    cargo.isChopIce()

    println()

    val iceDrift = IceDrift("Ледоход", 30, 30)
    iceDrift.printShip()
    iceDrift.isChopIce()
}

open class ShipLiner(
    val nameShip: String = "Лайнер",
    val speed: Int = 60,
    val liftingCapacity: Int = 100,
    val chopIce: Boolean = false,
) {
    fun printShip() {
        println("Тип корабля: $nameShip, Скорость: $speed км/ч, Вместительность: $liftingCapacity человек")
    }

    fun isChopIce() {
        if (chopIce) {println("$nameShip может колоть лёд")}
        else println("$nameShip не может колоть лёд")
    }
}

class CargoShip(
    nameShip: String,
    speed: Int,
    liftingCapacity: Int,
    ) : ShipLiner(nameShip, speed, liftingCapacity, false)

class IceDrift(
    nameShip: String,
    speed: Int,
    liftingCapacity: Int,
) : ShipLiner(nameShip, speed, liftingCapacity, true)
