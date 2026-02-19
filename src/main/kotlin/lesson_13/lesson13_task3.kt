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

    val listCompany = listPhoneDirectory.map { it.company }.filterNotNull().distinct()
    listCompany.forEach {println(it)}

}

data class PhoneDirectoryV2(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)
