package classesdemo

data class ClassUsers (var name: String, var age : Int)

fun main() {
    var user1 = ClassUsers("Rakesh",21)
    var user2 = ClassUsers("Vampire",22)

    println("${user1.name} is a ${user2.name}")
}