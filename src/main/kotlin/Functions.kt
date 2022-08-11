class Functions {
    fun double_full_version(x:Int):Int{

      return  x*2

    }

    fun double_single_line(x:Int)=x*2

    //Will now try lamda function

    var dirtLevel = 20
    val waterFilter = {level:Int -> level/2}

    //Will now try function types

    val specialWaterFilter : (Int)->Int={level->level/2}

    //Will now try higher-order functions

    fun encodeMsg(msg:String,encode:(String)->String):String{
        return encode(msg)
    }



}

fun enc2(msg:String):String{
    return msg.toUpperCase()
}

fun main(){
    val functions=Functions()
    val res1 =  functions.double_full_version(4)
    val res2 =  functions.double_single_line(4)
    println("Response 1 = $res1,Response 2 = $res2")
    println(functions.waterFilter(functions.dirtLevel))
    println(functions.specialWaterFilter(functions.dirtLevel))

    //Different ways of calling functions.encodeMsg
    val enc1:(String)->String={input->input.toUpperCase()}
    println(functions.encodeMsg("Hello,I am Aditya",enc1))
    println(functions.encodeMsg("Hello,I am Aditya",::enc2))
    println(functions.encodeMsg("Hello,I am Aditya",{input->input.toUpperCase()}))
    println(functions.encodeMsg("Hello,I am Aditya"){input->input.toUpperCase()})


}