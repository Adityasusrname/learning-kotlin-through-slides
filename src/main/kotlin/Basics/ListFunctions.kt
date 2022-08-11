package Basics

class ListFunctions {
    val books = listOf("nature","biology","birds")
    val numbers = listOf(1,2,3,4,5)

    fun print_filtered_books(){
        println(books.filter{
            it[0] == 'b'
        })
    }

    fun sequence_to_list(){
        val filtered = books.asSequence().filter {
            it[0] == 'b'
        }
        println(filtered.toList())
    }

    fun using_map(){
        val newNumbers=numbers.map {
            it*2
        }
        println(newNumbers)
    }

}

fun main(){
    val ListFunctions = ListFunctions()
    ListFunctions.print_filtered_books()
    ListFunctions.sequence_to_list()
    ListFunctions.using_map()
    val newList = listOf(ListFunctions.books,ListFunctions.numbers)
    println(newList.flatten())
}