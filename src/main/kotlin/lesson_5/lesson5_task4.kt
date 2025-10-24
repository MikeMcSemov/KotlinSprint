package org.example.lesson_5

const val LOGIN_USER_IN_BASE = "Zaphod"
const val PASSWORD_USER_IN_BASE = "PanGalactic"

fun main() {

    println("Приветствую вас на борту корабля \"Heart of Gold\"")

    println("Введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.:")
    val userName = readln()

    if (userName == LOGIN_USER_IN_BASE) {
        println("Введи, пожалуйста свой пароль:")
        val userPassword = readln()
        if (userPassword == PASSWORD_USER_IN_BASE) {
            println("Пользователь \"$LOGIN_USER_IN_BASE\", вам разрешено входить на борт корабля \"Heart of Gold\".")
        } else {
            println("Неправильный пароль. Попробуйте заново.")
        }
    } else {
        println("Такого пользователя нет. Необходимо зарегистрироваться")
    }
}
