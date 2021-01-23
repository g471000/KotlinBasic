/**
 * In Kotlin, main method is much simpler than java.
 * Also, you do not need to type long long println method as like Java
 */
fun main() {
    val heizeAlbums = arrayOf("Lyricist", "Late Autumn", "Fine", "Wind", "You" +
            " Are Cloudy", "And July")
    println(heizeAlbums.size)
    heizeAlbums.forEach { album ->
        println("Heize's $album")
    }

    heizeAlbums.forEachIndexed { index, album ->
        println("Heize album $index: $album")
    }
}