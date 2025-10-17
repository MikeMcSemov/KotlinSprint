package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val travelTime = 457
    val trainStartHour = 9
    val trainStartMinutes = 39

    val startTimeMinutes = trainStartHour * MINUTES_IN_HOUR + trainStartMinutes
    val endTimeMinutes = startTimeMinutes + travelTime

    println("%02d:%02d".format((endTimeMinutes / MINUTES_IN_HOUR), (endTimeMinutes % MINUTES_IN_HOUR)))
}
