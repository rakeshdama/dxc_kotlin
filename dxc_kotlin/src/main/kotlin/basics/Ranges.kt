package basics

fun main() {
    val x = 4;
    val y = 5

    if (x in 2..y) {
        println("X is in range")
    } else
        print("Not in Ramge")

    println(inRange(4))
}

fun inRange(num: Int): Boolean {
    return num in 2..4
}