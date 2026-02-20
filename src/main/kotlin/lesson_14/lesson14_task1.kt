package org.example.lesson_14

fun main() {
    val liner = ShipLiner()
    liner.printShip()
    liner.checkIceBreakingCapacity()

    println()

    val cargo = CargoShip()
    cargo.printShip()
    cargo.checkIceBreakingCapacity()

    println()

    val iceDrift = IceDrift()
    iceDrift.printShip()
    iceDrift.checkIceBreakingCapacity()
}

open class ShipLiner(
    open val nameShip: String = "Лайнер",
    open val speed: Int = 60,
    open val liftingCapacity: Int = 100,
    open val chopIce: Boolean = false,
) {
    fun printShip() {
        println("Тип корабля: $nameShip, Скорость: $speed км/ч, Вместительность: $liftingCapacity человек")
    }
    fun checkIceBreakingCapacity() {
        if (chopIce) {println("$nameShip может колоть лёд")}
        else println("$nameShip не может колоть лёд")
    }
}

class CargoShip(
    override val nameShip: String = "Грузовой",
    override val speed: Int = 40,
    override val liftingCapacity: Int = 70,
    ) : ShipLiner(nameShip, speed, liftingCapacity, false)

class IceDrift(
    override val nameShip: String = "Ледоход",
    override val speed: Int = 30,
    override val liftingCapacity: Int = 30,
) : ShipLiner(nameShip, speed, liftingCapacity, true)
