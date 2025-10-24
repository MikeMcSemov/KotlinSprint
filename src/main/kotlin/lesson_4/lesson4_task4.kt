package org.example.lesson_4

fun main() {

    var exercisesOfArmsAndAbs = true
    val day = 5

    if (day % 2 == 0)
        exercisesOfArmsAndAbs = !exercisesOfArmsAndAbs

    println(
        """
        Упражнения для рук: $exercisesOfArmsAndAbs
        Упражнения для ног: ${!exercisesOfArmsAndAbs}
        Упражнения для спины: ${!exercisesOfArmsAndAbs}
        Упражнения для пресса: $exercisesOfArmsAndAbs
    """.trimIndent()
    )

}
