package org.example.lesson_11

fun main() {

    val person1 = Person("Petr", StatusPerson.STATUS1.statusName)
    val person2 = Person("Tolik", StatusPerson.STATUS2.statusName)
    val person3 = Person("Alex", StatusPerson.STATUS3.statusName)
    val mutableListPersonRoomPlay = mutableListOf(person1, person2, person3)

    val roomPlay = RoomInterest("Фото", "Игровая комната", mutableListPersonRoomPlay)

    println("Здесь будет ${roomPlay.coverRoom}. Локация: ${roomPlay.nameRoom}")
    println(roomPlay.mutableListPerson.forEach { println("Никнейм: ${it.nickname} Статус: ${it.status}") })
    println()

    roomPlay.addPerson(Person("Vanya", StatusPerson.STATUS3.statusName))

    println("Здесь будет ${roomPlay.coverRoom}. Локация: ${roomPlay.nameRoom}")
    println(roomPlay.mutableListPerson.forEach { println("Никнейм: ${it.nickname} Статус: ${it.status}") })
    println()

    val updateStatus = roomPlay.updateStatusPerson("Tolik", StatusPerson.STATUS1.statusName)

    println("Здесь будет ${roomPlay.coverRoom}. Локация: ${roomPlay.nameRoom}")
    println(roomPlay.mutableListPerson.forEach { println("Никнейм: ${it.nickname} Статус: ${it.status}") })
    println()

}

class RoomInterest(
    val coverRoom: String,
    val nameRoom: String,
    val mutableListPerson: MutableList<Person>,
) {
    fun addPerson(person: Person) {
        mutableListPerson.add(person)
    }

    fun updateStatusPerson(nickname: String, status: String) {
        val mutableListFilter = mutableListPerson.filter { it.nickname == nickname }
        mutableListFilter.forEach { it.status = status }
    }
}


class Person(
    val nickname: String,
    var status: String,
)

enum class StatusPerson(val statusName: String) {
    STATUS1("разговаривает"),
    STATUS2("микрофон выключен"),
    STATUS3("пользователь заглушен");
}
