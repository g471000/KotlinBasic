fun getString(): String {
    return "Hello Kotlin!"
}

/**
 * Unit is like void in Java
 */
fun sayHello(): Unit {
    print(getString())
}

fun main() {
    println("Hello Kotlin!")
    println(getString())
    sayHello()
}