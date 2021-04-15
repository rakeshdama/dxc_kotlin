package classesdemo

object TemplateClass {
    fun getNumber(){
        var generateNo = java.util.Random()
        println(generateNo.nextInt(100))
    }
}

//fun main(){
//    var templateClass = TemplateClass()
//    templateClass.getNumber()
//}

fun main() {
    var templateClass = TemplateClass.getNumber()
}
