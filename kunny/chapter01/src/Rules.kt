class Rules {
}

fun main() {
    // String type not-nullable
    val a: String = "foo"

    // you can skip the type
    val b = "bar"

    // if you don't assign val, must add type
    val c: String

    // assign value
    c = "baz"

    // update integer d
    var d: Int = 0

    // change value
    d += 1

    greet("Jieun")
    println(sum(1, 2))
}

fun greet(name: String): Unit {
    println("No Return Function with input $name")
}

fun sum(a: Int, b: Int): Int = a + b