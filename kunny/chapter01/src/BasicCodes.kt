fun main() {
    // don't need to write type such as String
    val name = "Jieun"

    // do not use "new" keyword
    val basic = BasicCode();

    // allow null (String)
    val foo: String? = null
    foo = null // error because it was "val" which is immutable

    // do not allow null (String)
    val bar: String = "bar"
    // error if do >> bar = null
}

class BasicCode {

}
