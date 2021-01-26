class StreamAPI {

}

fun main() {
    val items = listOf(10, 2, 3, 5, 6)

    // get sum of even numbers
    val sumOfEvens = items.filter { it % 2 == 0 }.sum()
    print("sum is $sumOfEvens")
}