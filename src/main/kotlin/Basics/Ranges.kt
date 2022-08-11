package Basics

class Ranges {
    val numberOfStudents = 50
    fun check_for_range(){
        if(numberOfStudents in 1..100){
            println(numberOfStudents)
        }
    }
}

fun main(){
    val ranges=Ranges()
    ranges.check_for_range()
}