/**
 * Can not make global variable that is conflict with other class in same
 * directory.
 */
var pet2: String? = null

fun main() {
    when (pet2) {
        null -> println("Americano")
        else -> println(pet2)
    }
}

