package functions

class HigherOrder {
}

fun add(a:Int, b: Int):Int{
    return a+b
}

fun mul(a:Int, b:Int) = a*b

fun calculate(x : Int, y : Int, operation : (Int, Int) -> Int ):Int{
    return operation(x,y)
}

fun main() {
    var resultAdd = calculate(10,20, ::add)
    println(resultAdd)

    var resultMul = calculate(10,20,::mul)
    println(resultMul)

    var resultMax = calculate(10,20,::maxOf)
    println(resultMax)
}