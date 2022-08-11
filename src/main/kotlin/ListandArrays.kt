import java.util.*

class ListandArrays {

    fun trying_out_immutable_lists(){
        val instruments = listOf("trumpet","piano","violin")
        println(instruments)
    }
    fun trying_out_mutable_lists(){
        val myList= mutableListOf("trumpet","piano","violin")
        myList.remove("violin")
        println(myList)
    }
    fun trying_out_arrays(){
        val pets= arrayOf("dog","cat","canary")
        println(java.util.Arrays.toString(pets))
    }

    fun trying_out_plus_operator(){

        val numbers = intArrayOf(1,2,3)
        val numbers2 = intArrayOf(4,5,6)
        val combined=numbers2 + numbers
        println(Arrays.toString(combined))


    }

}

fun main(){
    val ListandArrays = ListandArrays()
    ListandArrays.trying_out_immutable_lists()
    ListandArrays.trying_out_mutable_lists()
    ListandArrays.trying_out_arrays()
    ListandArrays.trying_out_plus_operator()
}