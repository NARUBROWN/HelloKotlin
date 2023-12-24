package kotlinStandardTypeNumber

fun main() {
    val d = 1.234 // 실수 상수는 Double 타입으로 인식합니다. 123.5 또는 1.234e2는 모두 Double 타입입니다.
    val c = 1.234F // 접미사 f또는 F를 붙이면 Float 타입입니다. 실수 상수의 기본 타입은 Double 타입입니다.

    val i = 123 // Int 타입
    val longInt = 123L // 접미사 L을 붙이면 Long 타입입니다. 소문자 l은 1과 혼동할 수 있어 오류처리 됩니다.
    val b = 0b000111// 2진수 상수는 접두사 0b를 붙입니다. b는 binary를 뜻합니다.
    val f:Byte = 123 // Byte 타입


    // 타입 변환 (확대 및 축소)
    // Byte < Short < Int < Long < Float < Double
    // 타입 확대는 작은 타입에서 큰 타입으로 변환하는 것이며, 타입 축소는 큰 타입에서 작은 타입으로 변환하는 것이다.
    // 타입 축소이건 타입 확대이건 타입 변환함수 toXXX()를 사용해 변환할 수 있다.

    val binaryVar = 0b0111
    val transByte:Byte = binaryVar.toByte()
    // toString에서 인자는 진수를 가리킵니다. 인자를 생략하면 10진수 입니다.
    println("${binaryVar.toString(2)}, ${binaryVar.toString(16)}, $transByte")
}