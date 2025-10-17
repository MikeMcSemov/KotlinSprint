package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val startMoney = 70_000
    val percent = 16.7
    val depositPeriod = 20
    val totalPercent = 100

    val finishMoney = startMoney * (1 + percent / totalPercent).pow(depositPeriod)

    println("%.3f".format(finishMoney))
}
