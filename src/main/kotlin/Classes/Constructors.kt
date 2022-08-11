package Classes

class A{
}

class B(x:Int){

}

class C(val y:Int){

}

class Box(val length:Int,val width:Int=20,val height:Int=40){

}

class Square(val side:Int){
    init{
        println(side*2)
    }
}

class Circle(val radius:Double){
    constructor(name:String):this(1.0)
    constructor(diameter:Int):this(diameter/2.0){
        println("in diameter constructor")
    }
    init{
        println("Area:${Math.PI*radius*radius}")
    }
}

class Person(var firstName:String, var lastName:String){
    var fullName:String = ""

        get(){
        return "$firstName $lastName"
    }

    set(value) {
        val components = value.split(" ")
        firstName=components[0]
        lastName=components[1]
        field=value


    }

    val married:Boolean

    get(){
        return true
    }
}

fun main(){
    val aa = A()
    val bb = B(12)
    val cc = C(42)
    //We can't access bb.x
    println(cc.y)

    val box1=Box(100,20,40)
    val box2=Box(length = 100)
    val box3=Box(length = 100, width = 20, height = 40)

    val s=Square(10)

    val c = Circle(3)

    val person = Person ("John","Doe")
    println(person.fullName)
    println(person.married)

    person.fullName="Aditya Srivastava"
    println(person.fullName)






}