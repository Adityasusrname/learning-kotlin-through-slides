package Basics

class ExperimentsWithNull {
    var numberOfBooks = 6

    fun trying_question_mark_operator(){
       numberOfBooks= numberOfBooks?.dec()
        println(numberOfBooks)
    }
    fun trying_out_double_exclamation_operator(){
        var a = 5
        try {
            val len = a!!
        }
        catch(error:Error){

            println(error)

        }


    }
    fun trying_out_elvis_operator(){
       val check = null?:100
        println(check)
    }
}

fun main(){
    val ExperimentsWithNull = ExperimentsWithNull()
    ExperimentsWithNull.trying_question_mark_operator()
    ExperimentsWithNull.trying_out_double_exclamation_operator()
    ExperimentsWithNull.trying_out_elvis_operator()
}