package org.example.lesson_11

fun main() {

    val forum = Forum()

    val userFirst = forum.createNewUser("U1")
    val userSecond = forum.createNewUser("U2")

    forum.createNewMessage(0)
    forum.createNewMessage(1)
    forum.createNewMessage(0)
    forum.createNewMessage(1)

    forum.printThread()
}


class Forum(
    val userName: String = "",
    var userId: Int = 0,
    var authorId: Int = 0,
    val message: String = "",
    val mutableListUserForum: MutableList<User> = mutableListOf(),
    val mutableListMessageForum: MutableList<Message> = mutableListOf(),
) {

    fun createNewUser(userName: String) : User {
        mutableListUserForum.add(User(userName = userName, userId = mutableListUserForum.size))
        return mutableListUserForum[mutableListUserForum.lastIndex]
    }

    fun createNewMessage(userId: Int)  {
        if (userId in mutableListUserForum.indices) {
            println("Введите сообщение для ${mutableListUserForum[userId].userName}")
            mutableListMessageForum.add(Message(authorId = userId, readln()))
        }
    }

    fun printThread() {
        val mutableListMessageForumFilter = mutableListMessageForum.sortedBy { it -> it.message }
        mutableListMessageForumFilter.forEach { println("Author: ${it.authorId} Message: ${it.message}") }
    }

    data class User(
        var userName: String = "",
        var userId: Int = 0,
    ) {
        fun userName(userName: String) = apply { this.userName = userName }
        fun userId(userId: Int) = apply { this.userId = userId }
    }

    data class Message(
        var authorId: Int = 0,
        var message: String = "",
    ) {
        fun message(message: String) = apply { this.message = message }
        fun authorId(authorId: Int) = apply { this.authorId = authorId }
    }
}
