package kotlinStandardTypeString

fun main() {
    /*
    * Kotlin은 heap 메모리 중 특정 공간 String pool에 문자열을 저장하고 관리합니다.
    * String 타입 객체는 immutable 객체, 즉 read-only 객체입니다.
    * var로 선언했다고 해서 불변객체가 가변 객체로 바뀌는 것은 아닙니다.*/
    var foo:String = "My First Kotlin"

    val size:Int = foo.length

    for (i in 0..< size)
        print(foo[i])
    println()

    println("first char=${foo[0]}, last char=${foo[size-1]}")

    var ch1:Char = foo.get(3)
    var ch2:Char = foo[9]
    println("length=$size, ch1 $ch1 and ch2 $ch2")
}