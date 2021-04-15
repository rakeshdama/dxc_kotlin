package collections

class AssociateBy {
}

data class Person(val name: String, val city: String, val phone: Int)

var people = listOf<Person>(
    Person("Rakesh", "Tirupati", 79897),
    Person("Dama", "Bangalore", 87819),
    Person("Royal", "Bangalore", 81796)
)

fun main() {
    val phoneBook = people.associateBy { it.city }

    println(phoneBook)
}

