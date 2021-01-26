fun main() {
    // don't need to write type such as String
    val name = "Jieun"

//    // do not use "new" keyword
//    val basic = BasicKotlin();

    // allow null (String)
    val foo: String? = null
    // foo = null // error because it was "val" which is immutable

    // do not allow null (String)
    val bar: String = "bar"
    // error if do >> bar = null

    val foo2: String = "Foo"

    // foo2 = "foo" error because cannot assign to val

    var bar2: String = "bar"
    bar2 = "bar" // No error because it is var
    // bar2 = null error because it is not nullable

    var bar3: String? = "bar"
    bar3 = "bar" // can assign other string
    bar3 = null // can assign null
}