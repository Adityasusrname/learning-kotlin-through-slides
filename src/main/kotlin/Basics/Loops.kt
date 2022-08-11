package Basics

class Loops {

    val pets= arrayOf("dog","cat","canary")
    var bicycles=0

    fun trying_out_for(){
        for(element in pets){
            println(element+" ")
        }
    }

    fun trying_out_for_with_index(){
        for((index,element) in pets.withIndex()){
            println("Item at $index is $element\n")
        }
    }

    fun trying_out_while(){
        while(bicycles<50){
            bicycles++
        }
        println("$bicycles bicycles in the bicycle rack \n")
    }

    fun trying_out_do_while_loop(){
        do{
            bicycles--
        }
            while (bicycles>50)

            println("$bicycles bicycles in the bicycle rack\n")
    }

    fun trying_out_repeat(){
        repeat(2){
            println("Hello!")
        }
    }


}

fun main(){
    val loops=Loops()
    loops.trying_out_for()
    loops.trying_out_for_with_index()
    loops.trying_out_while()
    loops.trying_out_do_while_loop()
    loops.trying_out_repeat()
}