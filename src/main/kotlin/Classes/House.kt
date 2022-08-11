package Classes

class House {
    var color:String="white"
    val numberOfWindows:Int=2
    val isForSale:Boolean=false

    fun updateColor(newColor:String){
        color=newColor
    }
}

fun main(){
    val myHouse = House()
    println(myHouse)
}