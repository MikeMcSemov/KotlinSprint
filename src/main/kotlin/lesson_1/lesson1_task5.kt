package org.example.lesson_1

const val ONE_MINUTES_IN_SECONDS = 60
const val ONE_HOURS_IN_SECONDS = 3600

fun main() {

    val seconds = 6480
    val hours = seconds / ONE_HOURS_IN_SECONDS
    var remainingSeconds = seconds - hours * ONE_HOURS_IN_SECONDS
    val remainingMinutes = remainingSeconds / ONE_MINUTES_IN_SECONDS
    remainingSeconds -= remainingMinutes * ONE_MINUTES_IN_SECONDS
    println("%02d:%02d:%02d".format(hours,remainingMinutes,remainingSeconds))
}
