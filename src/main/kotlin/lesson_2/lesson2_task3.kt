package org.example.lesson_2

fun main() {
    val travelTime = 457
    val trainStartHour = 9
    val trainStartMinutes = 39

    val startTimeMinutes = trainStartHour * 60 + trainStartMinutes
    val endTimeMinutes = startTimeMinutes + travelTime

    println("${endTimeMinutes / 60}:${endTimeMinutes % 60}")
}
