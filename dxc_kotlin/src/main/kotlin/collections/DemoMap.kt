package collections

fun main() {
    val passedStudents : MutableMap<Int, String> = mutableMapOf()
    passedStudents.put(1,"rakesh")
    passedStudents.put(2,"dama")
    passedStudents.put(3,"royal")
    for ((i,j) in passedStudents){
        println(j)
    }

   println( passedStudents.values.filter { x -> x.startsWith("r") } )

    println( passedStudents.values.filter { it.startsWith("d") } )
}