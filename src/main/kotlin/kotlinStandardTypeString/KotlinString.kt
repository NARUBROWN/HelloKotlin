package kotlinStandardTypeString

import kotlin.math.PI

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

    stringFormat()
    templates()
    stringIsNotNormal()
    usingStringBuilder()
    whatIsDifferenceStringAndCharSequence()
}

fun stringFormat() {
    val pi:Float = PI.toFloat()
    val digit = 234
    var str:String = "Hello"

    /* String Format()은 규격화된 문자열을 출력합니다. String 타입 변수 출력 서식은 %s, Int 타입은 %d Float 타입은 %f입니다.
    * Float 타입은 %.nf 처럼 소수점 n번째 자리까지 출력할 수 있습니다. Int 타입 변수의 출력 서식을 %nd로 지정하면
    * 출력 자릿수를 n으로 지정하고 오른쪽 맞춤을 지정한 것 입니다. %-5d와 같이 -를 붙이면 왼쪽 맞춤입니다.*/
    println("PO = %.5f, %5d, %10s".format(pi, digit, str))
}

fun templates() {
    var a = 1
    println("a $a")
    a = 2
    var s = "a[a = $a]"
    println(s)
    val amount = 102.34

    val priceStr = "가격(USD): ${'$'}$amount" // $amount
    val priceStr2 = "가격(USD) : \$$amount" // $amount
    println(priceStr)
    println(priceStr2)
}

fun stringIsNotNormal() {
    val s = "Hello, Kotlin"
    val c:Char = s[4] // String 타입 변수의 원소는 Char 타입입니다.
    println("$c, ${s[4]}")

    // s[4] = 'X'로 원소의 값을 바꿀 수 없습니다.
    // String 타입은 immutable 변수이기 때문입니다.
    // String 타입을 var로 선언해서 새로운 값을 할당할수는 있지만, 이것은 새로운 위치에 생성되는 값을 참조하는 것 입니다.

    val newString = s.replace("Kotlin", "Java")
    println(newString)
    /*replace 메소드를 사용해서 String 객체의 값을 변경할 수는 있지만, 이전 값은 그대로 메모리에 남아있으며 새로운 String 타입 객체를 생성합니다.
    * replace 메소드 실행 결과를 할당하지 않아도 원본 객체 s는 바뀌지 않습니다.*/
}

fun usingStringBuilder() {
    val s = "Hello, Kotlin"
    var sb = StringBuilder()

    val index = 4
    val repl = 'X'

    s.forEachIndexed {i, c ->
        if (i == index)
            sb.append(repl)
        else
            sb.append(c)
    }
    println(sb.toString())
}

fun whatIsDifferenceStringAndCharSequence() {
    /*코틀린에서 String은 클래스이지만, CharSequence는 인터페이스이다.
    * String은 CharSequence 인터페이스를 구현한 클래스이다.
    * CharSequence는 부모이고 String은 자식 클래스이기 때문에 String 타입은 CharSequence 타입으로 자동 변환된다.
    *
    * 둘다 문자열을 처리하는 것은 같지만, 부분 문자열을 끄집어 내는 메소드 이름이 subSequence와 subString으로 다르다.
    * subSequence의 반환 타입이 CharSequence이기 때문에 s.subSequence는 toString을 사용해 String타입으로 변환해야 한다.*/
    var s:String = "Hello, String"
    var cs:CharSequence = ""

    cs = s // String은 CharSequence의 구현체기 때문에 타입 호환이 가능
    s = cs.toString() // String 타입에 CharSequence를 대입하려면 cs가 toString()으로 타입 변환되어야 함

    println(s.substring(0, 6))
    println(cs.subSequence(0, 6))

    /*String은 immutable 객체이지만 CharSequence는 mutable 문자열이다.
    *
    * CharSequence는 가변 문자열 특성을 StringBuilder나 StringBuffer와 결합해 최대 효과를 발휘한다.
    * StringBuilder는 CharSequence 인터페이스를 상속 받아 구현한 클래스이다.
    * StringBuiler나 StringBugger는 문자열을 넉넉하게 저장할 수 있는 메모리 공간을 활용하는 가변 문자열 클래스이다.*/
    var s2:String = ""
    var cs2:CharSequence = ""

    var sb:java.lang.StringBuilder = java.lang.StringBuilder()
    sb.append("Hello, ")
    sb.append("Kotlin")

    s2 = sb.toString()
    cs2 = sb
    println(s2)
    println(cs2)
    //String 불변 문자열을 다룰 때 가장 효과적인 타입이다.
}