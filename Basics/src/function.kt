fun getString(): String {
    return "Hello Kotlin!"
}

/**
 * Unit is like void in Java
 */
fun sayHello(): Unit {
    println(getString())
}

fun getStringEasy() : String = "Hello Easy Kotlin!"

fun sayEasyHello(): Unit = println(getStringEasy())

fun main() {
    println("Hello Kotlin!")
    println(getString())
    sayHello()
    sayEasyHello()
}