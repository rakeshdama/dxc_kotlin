package delegation

interface  SoundBehaviour{
    fun makeSound()
}

class ScreamBehaviour ( val scream : String) : SoundBehaviour {
    override fun makeSound() {
        println(scream.toUpperCase())
    }
}

class Singer (val song:String) : SoundBehaviour by ScreamBehaviour(song){

}

fun main() {
    val singer = Singer("Rakesh")
    singer.makeSound()
}