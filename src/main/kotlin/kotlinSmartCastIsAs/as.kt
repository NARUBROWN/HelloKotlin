package kotlinSmartCastIsAs

/* as 연산 기호
*  as코드는 아래처럼 간단하게 작성할 수 있습니다. 즉 as는 작동 형 변환이 아니라 대표_타입 as 구체적_타입처럼 변환 타입을
* 구체적으로 지정합니다.*/

fun main() {
    val str:Any = "Hello, Kotlin"
    val str2:String? = str as String? // 타입 변환이 안될 경우 null 값
    println(str2?.length)
}