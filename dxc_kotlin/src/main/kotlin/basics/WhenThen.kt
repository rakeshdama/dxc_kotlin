package basics

class WhenThen {
}

fun main() {
    println(describe(1))
    println(describe("Hello"))
    println(describe(1L))
}

fun describe(obj: Any): String {
    return when (obj) {
        1 -> "One"
        "Hello" -> "Hi"
        is Long -> "Long number"
        else -> "Unknown"
    }
}