package org.example.lesson_14

fun main() {
    val figures = listOf(
        Round("черный", 5.0),
        Round("белый", 3.0),
        Rectangle("черный", 4.0, 6.0),
        Rectangle("белый", 2.5, 3.5),
        Round("черный", 2.0),
        Rectangle("белый", 5.0, 5.0),
    )

   val blackPerimetersSum = figures.filter { it.color == "черный" }.sumOf { it.perimeterCalculation() }

   val whiteAreasSum = figures.filter { it.color == "белый" } .sumOf { it.areaCalculation() }

   println("Сумма периметров всех черных фигур: %.2f".format(blackPerimetersSum))
   println("Сумма площадей всех белых фигур: %.2f".format(whiteAreasSum))
}

abstract class Figure(
    val color: String,
) {
    abstract fun areaCalculation(): Double
    abstract fun perimeterCalculation(): Double
}

class Round(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun areaCalculation(): Double {
        return 3.1415926 * radius * radius
    }

    override fun perimeterCalculation(): Double {
        return 3.1415926 * 2 * radius
    }

    override fun toString(): String {
        return "Round(color='$color', radius=$radius)"
    }
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {
    override fun areaCalculation(): Double {
        return width * height
    }

    override fun perimeterCalculation(): Double {
        return 2 * (width + height)
    }

    override fun toString(): String {
        return "Rectangle(color='$color', width=$width, height=$height)"
    }
}
