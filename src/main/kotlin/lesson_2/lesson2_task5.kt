package org.example.lesson_2

import kotlin.math.pow

fun  main() {

    val startMoney = 70_000
    val percent = 16.7
    val depositPeriod = 20

    val finishMoney = startMoney * (1 + percent / 100).pow(depositPeriod)
    println(String.format("%.3f", finishMoney))
}
