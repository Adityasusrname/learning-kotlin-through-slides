package Classes

open class Superclass{
    open fun speak(){
        println("Hello!")
    }
}

class Subclass:Superclass(){
    override fun speak() {
        println("Bye!")
    }
}

fun main(){
    val Sublcass =Subclass()
    Sublcass.speak()
}