package kotlinStandardTypeCharAndBoolean

fun main() {
    var foo:Boolean = true
    val bar = false

    println( foo && bar ) // false
    println( foo || bar ) // ture
    println( !foo ) // false

    foo = !foo // toggle

    println(foo) // false
}