package functions

fun add(a:Int, b: Int):Int{
    return a+b
}

fun mul(a:Int, b:Int) = a*b

fun calculate(x : Int, y : Int, operation : (Int, Int) -> Int ):Int{
    return operation(x,y)
}

fun demoFunc(): (Int) -> Int {
    return :: square
}

fun square(x: Int) = x*x

fun main() {
    val resultAdd = calculate(10,20, ::add)
    println(resultAdd)

    val resultMul = calculate(10,20,::mul)
    println(resultMul)

    val resultMax = calculate(10,20,::maxOf)
    println(resultMax)

    val func = demoFunc()
    println(func(10))

}


