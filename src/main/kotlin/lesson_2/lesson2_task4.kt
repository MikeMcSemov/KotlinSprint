package org.example.lesson_2

fun main() {

    val buffs = 20
    val crystalOre = 7
    val ironOre = 11
    val totalPercent = 100

    println("Buffs with crystal ore: ${(crystalOre * buffs) / totalPercent}")
    println("Buffs with iron ore: ${(ironOre * buffs) / totalPercent}")
}
