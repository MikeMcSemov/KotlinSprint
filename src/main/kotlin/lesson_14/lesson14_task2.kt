package org.example.lesson_14

fun main() {
    val liner = ShipLinerN()
    liner.printShip()
    liner.isChopIce()

    println()

    val cargo = CargoShipN("Грузовой", 40, 70)
    cargo.printShip()
    cargo.isChopIce()

    println()

    val iceDrift = IceDriftN("Ледоход", 30, 30)
    iceDrift.printShip()
    iceDrift.isChopIce()
}

open class ShipLinerN(
    val nameShip: String = "Лайнер",
    val speed: Int = 60,
    val liftingCapacity: Int = 100,
    val chopIce: Boolean = false,
    val loadMethode: String = "Выдвигает горизонтальный трап со шкафута.",
) {
    fun printShip() {
        println("Тип корабля: $nameShip, Скорость: $speed км/ч, Вместительность: $liftingCapacity человек, $loadMethode")
    }

    fun isChopIce() {
        if (chopIce) {println("$nameShip может колоть лёд")}
        else println("$nameShip не может колоть лёд")
    }
}

class CargoShipN(
    nameShip: String,
    speed: Int,
    liftingCapacity: Int,
) : ShipLinerN(nameShip, speed, liftingCapacity, false, "Активирует погрузочный кран.")

class IceDriftN(
    nameShip: String,
    speed: Int,
    liftingCapacity: Int,
) : ShipLinerN(nameShip, speed, liftingCapacity, true, "Открывает ворота со стороны кормы.")
