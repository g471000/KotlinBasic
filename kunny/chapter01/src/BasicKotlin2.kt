fun main() {
    // list that is immutable
    val immutable: List<String> = listOf("foo", "bar", "baz")

    // immutable.add("Foo") compile error

    val mutable: MutableList<String> = mutableListOf("foo", "bar", "baz")
    mutable.add("Foo") // no error
}