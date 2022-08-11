class Conditionals {

    val numberOfCups = 30
    val numberOfPlates = 50
    fun checkForCups(){
        if(numberOfCups > numberOfPlates){
            println("Too many cups!")
        }
        else{
            println("Not enough cups!")
        }
    }
}

fun main(){
    val conditionals = Conditionals()
    conditionals.checkForCups()
}