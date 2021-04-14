package basics

import java.util.*

fun main() {

    var nums = listOf<Int>(1,2,3,4,5)

    for(i in nums.indices){
        println(" At index $i the value is ${nums[i]}")
    }

    println("\nWorking of Maps")
    var names = TreeMap<Int, String>()

    names[1] = "Rakesh"
    names[2] = "Dama"

//    println(names)

    for ((num,name) in names){
        println("$num : $name")
    }

}