package org.example.lesson_10

fun main() {

    var countWinnerRounds = 0

    if (gameRound()) ++countWinnerRounds

    while (true) {

        println("Хотите бросить кости еще раз? Введите Да или Нет")
        var nameCommand = readln()

        when (nameCommand) {
            "Да" -> {
                if (gameRound()) ++countWinnerRounds
            }

            "Нет" -> {
                println("Количество выигрышных партий человека: $countWinnerRounds")
                break
            }

            else -> {
                println("Введено что-то другое. Выхожу...")
                break
            }
        }
    }
}

fun rollDice(): Int {
    val rangeDigit = 1..6
    return rangeDigit.random()
}

fun gameRound(userRollDice: Int? = rollDice(), computerRollDice: Int? = rollDice()): Boolean {

    var numberOfBatches = false

    println("У игрока выпало на кубиках: $userRollDice")
    println("У компьютера выпало на кубиках: $computerRollDice")

    if (userRollDice!! > computerRollDice!!) {
        println("Победило человечество")
        numberOfBatches = true
    } else if (userRollDice!! == computerRollDice!!) println("Победила дружба")
    else println("Победила машина")

    return numberOfBatches
}
