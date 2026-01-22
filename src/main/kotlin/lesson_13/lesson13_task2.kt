package org.example.lesson_13

fun main() {
    val phoneDirectoryV1 = PhoneDirectoryV1("LukOil", 89996663321, null)

    phoneDirectoryV1.printInformationUser()
}

class PhoneDirectoryV1(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printInformationUser() {
        val variable = company ?: "<не указано>"

        println("Имя: $name\nНомер: $phoneNumber\nКомпания: $variable")
    }
}
