package basics

fun main() {
    var num1 = 10
    var num2 = 20

    println("The is addition of $num1 and $num2 is ${num1 + num2}")
//    println(num1.hashCode() + num2.hashCode())
    var result = 0

//    if (num1 > num2) result = num1
//    else result = num2

    result = if (num1 > num2) num1 else if (num2 > num2) num2 else 0
        println(result)

    var st1 = "Rakesh"
    var st2 = "Royal"

    println(if (st1 == st2) "Same" else "Not same" )


}