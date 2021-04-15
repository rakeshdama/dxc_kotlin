package classesdemo

class Company {
    var news: String ?= null

    companion object Media {
        fun broadCast() {
            println("Starting a Icecream parlour")
        }
    }
}

fun main() {

    Company.broadCast()

}