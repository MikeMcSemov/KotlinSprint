package org.example.lesson_14

fun main() {
    val liner = ShipLinerN()
    liner.printShip()
    liner.checkIceBreakingCapacity()
    liner.load()

    println()

    val cargo = CargoShipN()
    cargo.printShip()
    cargo.checkIceBreakingCapacity()
    cargo.load()

    println()

    val iceDrift = IceDriftN()
    iceDrift.printShip()
    iceDrift.checkIceBreakingCapacity()
    iceDrift.load()
}

open class ShipLinerN(
    open val nameShip: String = "Лайнер",
    open val speed: Int = 60,
    open val liftingCapacity: Int = 100,
    open val chopIce: Boolean = false,
) {
    fun printShip() {
        println("Тип корабля: $nameShip, Скорость: $speed км/ч, Вместительность: $liftingCapacity человек")
    }

    fun checkIceBreakingCapacity() {
        if (chopIce) {
            println("$nameShip может колоть лёд")
        } else println("$nameShip не может колоть лёд")
    }

    open fun load() {
        println("Выдвигает горизонтальный трап со шкафута.")
    }
}

class CargoShipN(
    override val nameShip: String = "Грузовой",
    override val speed: Int = 40,
    override val liftingCapacity: Int = 70,
) : ShipLinerN(nameShip, speed, liftingCapacity, false) {
    override fun load() {
        println("Активирует погрузочный кран.")
    }
}

class IceDriftN(
    override val nameShip: String = "Ледоход",
    override val speed: Int = 30,
    override val liftingCapacity: Int = 30,
) : ShipLinerN(nameShip, speed, liftingCapacity, true) {
    override fun load() {
        println("Открывает ворота со стороны кормы.")
    }
}
