package org.example.lesson_13

fun main() {
    val listPhoneDirectory = listOf <PhoneDirectoryV2> (PhoneDirectoryV2("Ivan", 89991234567, null), PhoneDirectoryV2("Alex", 84567891234, "null"),
        PhoneDirectoryV2("Toha", 87456123541, null))

    listPhoneDirectory.forEach { println("Имя: ${it.name}\nНомер телефона: ${it.phoneNumber}\nКомпания: ${it.company}\n") }
}

class PhoneDirectoryV2(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)
