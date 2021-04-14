package basics

fun main() {
    var a = 9
    var b = "rakesh"
    var c = "Rakesh@$a"
    var sentence = "${b.replace("rakesh", "Rakesh")}"
    println(a)
    println(b)
    println(c)
    println(sentence)
    println("Max is " + maxOfNumbers(10, 90))

    val items = listOf<String>("rakesh", "vampire", "devil")

    for (item in items) {
        println(item)
    }
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}

fun maxOfNumbers(a: Int, b: Int): Int {
    return if (a > b) a
    else b
}
