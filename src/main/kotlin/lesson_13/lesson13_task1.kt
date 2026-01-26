package org.example.lesson_13

fun main() {
    val phoneDirectory = PhoneDirectory("LukOil", 89996663321)
}

class PhoneDirectory(
    name: String,
    phoneNumber: Long,
    company: String? = null,
)