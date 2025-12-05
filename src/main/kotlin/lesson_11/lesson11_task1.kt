package org.example.lesson_11

class DataUser (
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
)

fun main() {

    val dataUser1 = DataUser (
        id = 1,
        login = "P1",
        password = "qwerty",
        mail = "dog@mail.ru"
    )

    val dataUser2 = DataUser (
        id = 2,
        login = "P2",
        password = "qazwsx",
        mail = "cat@mail.ru"
    )

    println(dataUser1.id)
    println(dataUser1.login)
    println(dataUser1.password)
    println(dataUser1.mail)
    println()
    println(dataUser2.id)
    println(dataUser2.login)
    println(dataUser2.password)
    println(dataUser2.mail)
}
