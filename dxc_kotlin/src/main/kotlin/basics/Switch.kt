package basics

fun main() {
    val num = 3

   var str = when (num){
        1 -> "It's a one"
        2 -> "It's a two"
        3 -> "It's a three"
        else -> "We don't do that"
    }
    println("Str is $str")
}