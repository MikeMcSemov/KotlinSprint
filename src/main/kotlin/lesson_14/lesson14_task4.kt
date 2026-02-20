package org.example.lesson_14

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isHabitable: Boolean,
) {
    open fun printInfo() {
        println("$name: атмосфера = ${if (hasAtmosphere) "есть" else "нет"}, пригодность = ${if (isHabitable) "пригодна" else "не пригодна"}")
    }
}

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isHabitable: Boolean,
    val moons: MutableList<Moon> = mutableListOf()
) : CelestialBody(name, hasAtmosphere, isHabitable) {

    fun addMoon(moon: Moon) {
        moons.add(moon)
    }

    fun printWithMoons() {
        printInfo()
        if (moons.isNotEmpty()) {
            println("Спутники планеты $name:")
            moons.forEach { println("  - ${it.name}") }
        } else {
            println("У планеты $name нет спутников")
        }
    }
}

class Moon(
    name: String,
    hasAtmosphere: Boolean,
    isHabitable: Boolean,
    val parentPlanet: Planet? = null
) : CelestialBody(name, hasAtmosphere, isHabitable)


fun main() {
    val earth = Planet(
        name = "Земля",
        hasAtmosphere = true,
        isHabitable = true
    )

    val moon1 = Moon(
        name = "Луна",
        hasAtmosphere = false,
        isHabitable = false,
        parentPlanet = earth
    )

    val moon2 = Moon(
        name = "Деймос",
        hasAtmosphere = false,
        isHabitable = false,
        parentPlanet = earth
    )

    earth.addMoon(moon1)
    earth.addMoon(moon2)

    earth.printWithMoons()
}
