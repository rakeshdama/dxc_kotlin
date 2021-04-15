package functions

@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val name : String = "Rakesh"
    val upperName : (String) -> String = {str : String -> str.toUpperCase()}
    val lowerName : (String) -> String = {str -> str.toLowerCase()}
    val toCharName = {str : String -> str.toCharArray()}
//    val upperCase = {str : str - > toUppercase()}
    val toUpper : (String) -> String = String :: uppercase

    println(name)
    println(upperName(name))
    println(lowerName(name))
    println(toCharName(name)[0])
    println(toUpper(name))
}