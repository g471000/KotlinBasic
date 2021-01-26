fun main() {
    countItems(1)
    countItems(3)
}

// when is like switch in JAVA
// when is like switch in JAVA
fun countItems(count: Int){
    when(count){
        1 -> println("There is $count item.")
        else -> println("There are $count items.")
    }
}