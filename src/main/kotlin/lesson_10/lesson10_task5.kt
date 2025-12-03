package org.example.lesson_10

const val LOGIN_USER = "Vasya_Pupkin"
const val PASSWORD_USER = "qwerty!"

fun main() {

    val loginUserTest = "Vasya_Pupkin"
    val passwordUserTest = "qwerty!"

    val userAuthorization = userAuthorization(loginUserTest, passwordUserTest)
    val shoppingCart = gettingShoppingCart(userAuthorization)
    println(shoppingCart?.joinToString())
}

fun userAuthorization(loginUser: String?, passwordUser: String?): String? {

    val tockenCodeSize = 32
    val tockenRangeList = 0.rangeTo(9).toList() + 'a'.rangeTo('z').toList()
    val tockenCodeList = List(tockenCodeSize) { index -> tockenRangeList.random() }

    return if (loginUser == LOGIN_USER && passwordUser == PASSWORD_USER) {
        tockenCodeList.joinToString("")
    } else null
}

fun gettingShoppingCart(tocken: String?): List<String>? {

    val productList = listOf("Овощи", "Мясо", "Яйца", "Творог", "Фрукты")

    return if (tocken == null) {
        println("Неправильный логин или пароль. Повторите снова.")
        null    //не могу понять почему null тоже выводится в консоль при неверно введенных данных
    } else productList
}
