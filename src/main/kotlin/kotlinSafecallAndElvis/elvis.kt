package kotlinSafecallAndElvis

fun main() {
    /* 안전 호출 표현은 엘비스 연산 기호(?:)와 함께 사용하면 코트를 압축해서 표현할 수 있습니다.
    * 엘비스 연산 기호의 기능은 if-else 문과 같습니다. 엘비스 연산 기호 앞에 놓인 수식은 조건이 참일때 값이며, 연산 기호 뒤에 놓은 값은 조건이 거짓일때 값입니다.
    * 변수 len은 str 객체가 널이면 -1 널이 아니면 str.length의 결과가 할당됩니다.*/
    var str:String? = "Hello, Kotlin"
    str = null
    val len = str?.length ?: -1
}