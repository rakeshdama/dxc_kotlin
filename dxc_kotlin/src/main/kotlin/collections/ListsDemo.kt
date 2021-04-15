package collections

class ListsDemo {

    fun addSysUser(newUsers: Int, list: MutableList<Int>){
        list.add(newUsers)
}
    fun printList(list: MutableList<Int>){
        for (i in list){
            println(i)
        }
    }

    fun printStrings(list: List<String>){
        for (i in list){
            println(i)
        }
    }
}
fun main() {
    var lists = ListsDemo()
    val sysUsers : MutableList<Int> = mutableListOf(1,2,3,4,5)
    lists.addSysUser(10,sysUsers)
    lists.printList(sysUsers)

    val otherUsers = listOf<String>("Rakesh","Dama","Royal")
    lists.printStrings(otherUsers)
}