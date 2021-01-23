fun sayHello(place: String, names: List<String>){
    names.forEach { name ->
        println("Hello $name! Welcome to $place")
    }
}

fun main(){
    val names = listOf("Jieun", "Heize", "Pikachu")
    sayHello("Korea", names)
}