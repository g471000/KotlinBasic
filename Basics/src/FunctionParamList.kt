fun sayHello(place: String, names: List<String>){
    names.forEach { name ->
        println("Hello $name! Welcome to $place")
    }
}

fun sayHello2(place: String, vararg names: String){
    names.forEach { name ->
        println("Hello $name! Welcome to $place")
    }
}

fun main(){
    val names1 = listOf("Jieun", "Heize", "Pikachu")
    sayHello("Korea", names1)

    val names2 = arrayOf("Jieun", "Heize", "Pikachu")
    sayHello2("US", *names2)
    sayHello2("Pokemon World")
}