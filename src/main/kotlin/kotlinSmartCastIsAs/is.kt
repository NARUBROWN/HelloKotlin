package kotlinSmartCastIsAs

fun main() {
    val s = "Hello, Kotlin" // String 타입으로 인식
    if (s is String)
        println("$s is ${s.javaClass}") // Hello, Kotlin is class java.lang.String
    else if (s is String)
        println("$s is Not String The type is ${s.javaClass}")
}