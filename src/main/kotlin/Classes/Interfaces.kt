package Classes

interface Shape{
    fun computeArea():Double
}

class Rectangle(val side1:Double,val side2:Double):Shape{
    override fun computeArea(): Double = side1 * side2
}

fun main(){
    val rectangle = Rectangle(2.0,3.0)
    println(rectangle.computeArea())
}


