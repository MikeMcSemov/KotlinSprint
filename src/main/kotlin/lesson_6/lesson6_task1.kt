package org.example.lesson_6

fun main() {

    println("Создайте логин:")
    val  loginUser = readln()

    println("Создайте пароль:")
    val passwordUser = readln()

    println("Авторизация прошла успешно!")

    println("Введите логин:")
    var login: String = readln()
    println("Введите пароль:")
    var password: String = readln()


    while (!loginUser.equals(login) || !passwordUser.equals(password)) {
        println("Введите логин снова:")
        login = readln()
        println("Введите пароль снова:")
        password = readln()
    }

    println("Авторизация прошла успешно")

}
