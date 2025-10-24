package org.example.lesson_4

fun main() {

    val day = 5

    val exercisesOfArmsAndAbs = if (day % 2 == 0) true else false

    println(
        """
        Упражнения для рук: $exercisesOfArmsAndAbs
        Упражнения для ног: ${!exercisesOfArmsAndAbs}
        Упражнения для спины: ${!exercisesOfArmsAndAbs}
        Упражнения для пресса: $exercisesOfArmsAndAbs
    """.trimIndent()
    )
}
