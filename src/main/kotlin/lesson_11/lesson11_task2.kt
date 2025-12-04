package org.example.lesson_11

class DataUser2 (
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = "Необязательное свойство",
) {
    fun printInfoUser() {
        println("""
            Вывод информации о пользователе:
            Номер: $id
            Логин: $login
            Пароль: $password
            Почта: $mail
            О себе: $bio
            
        """.trimIndent())
    }

    fun bioChange(): String {
        println("Введите данные для поля \"О себе:\"")
        this.bio = readln()
        return bio
    }

    fun passwordChange() {
        println("Введите текущий пароль:")

        val passwordOldUser = readln()

        if (passwordOldUser == password) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль изменен")
        } else println("Пароли не совпадают")
    }
}


fun main() {

    val dataUserNew = DataUser2 (
        id = 1,
        login = "P1",
        password = "qwerty",
        mail = "dog@mail.ru"
    )

    dataUserNew.printInfoUser()
    dataUserNew.bioChange()
    dataUserNew.passwordChange()
    dataUserNew.printInfoUser()
}
