package namedargs

data class Format(val userName : String, val domain : String){

}
fun main(){
    println(Format("rakesh","rakeshdama.me"))
    println(Format("rakeshdama.me","rakeshdama"))
    println(Format(userName = "rakeshdama", domain = "rakeshdama.me"))
}