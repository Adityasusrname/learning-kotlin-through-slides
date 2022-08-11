class Strings{

    fun printStringWithVariables(){

        val numberOfDogs = 3
        val numberOfCats = 2

        println("I have $numberOfDogs"+" and $numberOfCats cats")
    }

    fun templateString(){
        val s = "abc"
        println("$s.length is ${s.length}")
        val numberOfShirts = 10
        val numberOfPants = 5
        println("I have ${numberOfShirts + numberOfPants} items of clothing")
    }

}


fun main(){
    val stringsObject = Strings()
    stringsObject.printStringWithVariables()
    stringsObject.templateString()
}




