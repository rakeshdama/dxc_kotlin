package collections

class SetsDemo {
  fun addIssue(str: String, issue: MutableSet<String>): Boolean {
        if (issue.add(str)) {
            println("Issue $str added")
            return true
        }
        else {
            println("Issue $str already exists")
            return false
        }
  }

    fun printIssues(issue: MutableSet<String>){
        for (i in issue){
            println(i)
        }
    }
}

fun main() {
    val issues: MutableSet<String> = mutableSetOf("1", "2", "3")
    val demosets = SetsDemo()
    demosets.addIssue("1",issues)
    demosets.addIssue("Other",issues)
    demosets.printIssues(issues)

}