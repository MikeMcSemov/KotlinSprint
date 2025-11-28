package org.example.lesson_10

fun main() {

    lenghtData(loginUser(), passwordUser())
}

fun loginUser(): String? {
    println("Придумайте логин:")
    return readln()
}

fun passwordUser(): String? {
    println("Придумайте пароль:")
    return readln()
}

fun lenghtData(loginUserWord: String?, passwordLoginWord: String?) {

    val minimumLength = 4

    if (loginUserWord!!.length >= minimumLength && passwordLoginWord!!.length >= minimumLength) {
    println("Логин и пароль успешно добавлены!")
    } else println("Логин или пароль недостаточно длинные")
}
