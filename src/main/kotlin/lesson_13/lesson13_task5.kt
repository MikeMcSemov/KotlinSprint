package org.example.lesson_13

fun main() {

    val phoneBook = PhoneList()

    while (true) {
        println("Добавление нового контакта:")
        println("Для выхода введите 'Выход'")

        print("Введите имя:")
        val name = readlnOrNull()

        if (name == "Выход") break
        if (name.isNullOrBlank()) {
            println("Ошибка: Имя не может быть пустым!")
            continue
        }

        print("Введите номер телефона: ")
        val phoneInput = readlnOrNull()

        if (phoneInput.isNullOrBlank()) {
            println("Ошибка: Номер телефона не может быть пустым!")
            continue
        }

        val phoneNumber = phoneInput.toLongOrNull()
        if (phoneNumber == null) {
            println("Ошибка: Некорректный номер телефона! Используйте только цифры")
            continue
        }

        print("Введите название компании (необязательно): ")
        val companyInput = readlnOrNull()
        val company = if (companyInput.isNullOrBlank()) null else companyInput

        val contact = ContactUser(name, phoneNumber, company)
        phoneBook.addContact(contact)
    }

    phoneBook.printPhoneBook()
}

class ContactUser(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printContact() {
        println("Имя: $name")
        println("Телефон: $phoneNumber")
        println("Компания: ${company ?: "не указана"}")
    }
}

class PhoneList {
    private val contacts = mutableListOf<ContactUser>()

    fun addContact(contact: ContactUser) {
        contacts.add(contact)
    }

    fun printPhoneBook() {
        println("Контакт:")
        contacts.forEach { it.printContact() }
    }
}
