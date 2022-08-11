package Basics

class When {
    val results=50

    fun check_results(){
        when(results){
            0->println("No results")
            in 1..39 -> println("Got results!")
            else -> println("That's a lot of results!")
        }
    }

}

fun main(){
    val whenObject = When()
    whenObject.check_results()
}