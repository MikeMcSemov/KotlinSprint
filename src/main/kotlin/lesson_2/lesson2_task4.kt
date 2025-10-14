package org.example.lesson_2

fun  main() {

    val buffs = 0.2
    val crystalOre = 7
    val ironOre = 11

    println("Buffs with crystal ore: ${(crystalOre*buffs).toInt()}")
    println("Buffs with iron ore: ${(ironOre*buffs).toInt()}")
}
