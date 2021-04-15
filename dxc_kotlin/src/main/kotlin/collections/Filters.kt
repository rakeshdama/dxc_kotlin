package collections

fun main() {

    var x = listOf<Int>(1, 2, 3, -4, 5, -6, -2, 5)

    println(x.filter { i -> i > 0 })
    //println(x.filter { it > 1 })

    var doubleTheNumber = x.map { it -> it * it }

    println(doubleTheNumber)

    println("If any number greater than 20 => ${doubleTheNumber.any { it > 20 }}")
    println("are all numbers greater than 0 => ${doubleTheNumber.all { it > 0 }}")
    println("are none of the numbers greater than 20 => ${doubleTheNumber.none { it > 50 }}")
}