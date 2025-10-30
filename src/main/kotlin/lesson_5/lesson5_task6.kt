package org.example.lesson_5

const val COEF_FROM_CM_IN_METERS = 0.01
const val COEF_BODY_MASS_INDEX_MIN = 18.5
const val COEF_BODY_MASS_INDEX_AVERAGE = 25.0
const val COEF_BODY_MASS_INDEX_MAX = 30.0

fun main() {

    println("Введите вес в кг:")
    val weightUser = readln().toFloat()

    println("Введите рост в см:")
    val heightUser = readln().toFloat()

    val heightUserInMetre = heightUser * COEF_FROM_CM_IN_METERS
    val bodyMassIndex = weightUser / (heightUserInMetre * heightUserInMetre)

    when {
        bodyMassIndex < COEF_BODY_MASS_INDEX_MIN -> println(
            "Ваше значение ИМТ: %.2f. Недостаточная масса тела.".format(
                bodyMassIndex
            )
        )

        bodyMassIndex in COEF_BODY_MASS_INDEX_MIN..<COEF_BODY_MASS_INDEX_AVERAGE -> println(
            "Ваше значение ИМТ: %.2f. Нормальная масса тела.".format(
                bodyMassIndex
            )
        )

        bodyMassIndex in COEF_BODY_MASS_INDEX_AVERAGE..<COEF_BODY_MASS_INDEX_MAX -> println(
            "Ваше значение ИМТ: %.2f. Избыточная масса тела.".format(
                bodyMassIndex
            )
        )

        else -> println("Ожирение")
    }

}
