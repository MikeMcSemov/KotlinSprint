package org.example.lesson_4

const val EXERCISES_FOR_THE_MUSCLES_OF_THE_ARMS_AND_ABS = true
const val EXERCISES_FOR_THE_MUSCLES_OF_THE_LEG_AND_BACK = !EXERCISES_FOR_THE_MUSCLES_OF_THE_ARMS_AND_ABS

fun main() {

    var trainingMuscles = EXERCISES_FOR_THE_MUSCLES_OF_THE_ARMS_AND_ABS

    val day = 5

    if (day % 2 == 0) {
        trainingMuscles = !trainingMuscles
    } else {

    }

    println("""
        Упражнения для рук: ${trainingMuscles}
        Упражнения для ног: ${!trainingMuscles}
        Упражнения для спины: ${!trainingMuscles}
        Упражнения для пресса: ${trainingMuscles}
    """.trimIndent())

}
