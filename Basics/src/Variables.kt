/**
 * var is like a general variable and can be assigned multiple times and is
 *  known as the mutable variable in Kotlin. Whereas val is a constant variable
 *  and can not be assigned multiple times and can be Initialized only single
 *  time and is known as the immutable variable in Kotlin.
 */
class Variables {
    val name = "Jieun"
    var hobby = "Basketball"
    fun main() {
        println("$name's hobby is $hobby.")
        hobby = "Coding with Kotlin"
        println("Now $name's hobby is $hobby.")
    }
}