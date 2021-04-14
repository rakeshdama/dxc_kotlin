package basics

fun main() {

    var nums = 1..5
//    println(nums.count())
    for (num in nums.reversed() step 2){
        println("$num")
    }
    println()
    var descnums = 5 downTo 1
    for (num in descnums.reversed()){
        println(num)
    }
}