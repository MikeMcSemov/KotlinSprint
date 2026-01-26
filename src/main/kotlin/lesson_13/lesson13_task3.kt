package org.example.lesson_13

fun main() {
    val listPhoneDirectory = listOf (
        PhoneDirectoryV2("Ivan", 89991234567, null),
        PhoneDirectoryV2("Alex", 84567891234, "null"),
        PhoneDirectoryV2("Toha", 87456123541, null),
        PhoneDirectoryV2("Jack", 87456123641, "Oil"),
        PhoneDirectoryV2("Pepper", 87456123742, "Gaz"),
    )

    println("Список уникальных компаний:")
    listPhoneDirectory.forEach {
        if (it.company != null) {
        println(it.company)} }
}

class PhoneDirectoryV2(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)
