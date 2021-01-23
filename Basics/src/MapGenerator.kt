/**
 * Use mapOf which create immutable map.
 */
fun main() {
    val heizeAlbums = mapOf(1 to "Lyricist", 2 to "Late Autumn", 3 to "Fine",
            4 to "Wind", 5 to "You", 6 to " Are Cloudy", 7 to "And July")

    heizeAlbums.forEach { (key, value) ->
        println("Album $key: $value")
    }
}