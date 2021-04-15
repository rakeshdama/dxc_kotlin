package classesdemo

data class Users (var name: String, var age : Int)

fun main() {
    var user1 = Users("Rakesh",21)
    var user2 = Users("Vampire",22)

    println("${user1.name} is a ${user2.name}")
}