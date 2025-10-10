package org.example.lesson_1

const val oneMinutesInSeconds : Byte = 60
const val oneHoursInSeconds : Short = 3600

fun main() {

    val seconds : Short = 6480

    val hours : Byte = (seconds / oneHoursInSeconds).toByte()
    var remainingSeconds : Short = (seconds - hours*oneHoursInSeconds).toShort()
    val remainingMinutes : Byte = (remainingSeconds / oneMinutesInSeconds).toByte()
    remainingSeconds = (remainingSeconds - remainingMinutes * oneMinutesInSeconds).toShort()

    println("0$hours:$remainingMinutes:0$remainingSeconds")
}
