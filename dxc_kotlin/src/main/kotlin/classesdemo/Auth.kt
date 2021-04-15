package classesdemo

object DoAuth{
   private var username = "Rakesh"
   private var password = "rakesh"
    fun validateCredentials(username : String, password: String):Boolean{
        return this.username == username && this.password == password
    }
}

fun main() {
    if (DoAuth.validateCredentials("Rakesh","rakesh")) println("Hey Rakesh") else print("Wrong Credentials")
}