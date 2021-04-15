package collections

fun main() {

    var x = listOf<Int>(1, 2, 3, -4, 5, 6, -2, 5)

    println(x.filter { i -> i > 0 })
    println("The first positive even number is ${x.find { i -> i%2==0 }}")
    println("the last positive even number is ${x.findLast { i -> i%2==0 && i > 0 }}")
    println("This will print the count ${x.count{ it % 2 ==0 && it >0 }}")
    //println(x.filter { it > 1 })

    println( "\n the even numbers are ${x.partition { it % 2 == 0 && it > 0}  } \n")

    val bagFruits = listOf<String>("Apple", "banana", "Mango")
    val bagClothes = listOf<String>("Shirt", "Pant")

    val cart = listOf(bagFruits, bagClothes)
    val mapBag = cart.map { it }
    val flatMapBag = cart.flatMap { it }

    println(cart)
    println(mapBag)
    println(flatMapBag)
    println()


    var doubleTheNumber = x.map { it -> it * it }

    println(doubleTheNumber)

    println("If any number greater than 20 => ${doubleTheNumber.any { it > 20 }}")
    println("are all numbers greater than 0 => ${doubleTheNumber.all { it > 0 }}")
    println("are none of the numbers greater than 20 => ${doubleTheNumber.none { it > 50 }}\n")


    var words = listOf<String>("first", "line", "is", "the", "fake", "one")
    println("The first word is ${words.find { it.startsWith("f") } }")
    println("The first word is ${words.findLast { i -> i.startsWith("f") } }")
}