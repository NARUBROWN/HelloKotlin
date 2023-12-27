package kotlinSmartCastIsAs

/*자동 형 변환은 코틀린 컴파일러가 변수의 타입을 유추하는 것을 말합니다. 아래 예에서 Number라는 숫자 타입을 대표하는 타입입니다.
* 즉 Number 타입은 어느 숫자 타입과도 호환됩니다. 함수 typeCheck()의 파라미터 타입은 Any입니다. Any는 최상위 기본 클래스로써 어떤 타입과도 호환됩니다.
*
* 변수 num에 "8L"을 할당하면, 변수 num의 타입은 Long 타입으로 바뀝니다.
* 마찬가지로 변수 str은 Any타입으로 선언했지만, 문자열을 할당하면서 구체적인 타입인 String 타입으로 바뀝니다.
* 이러한 예가 자동 형 변환입니다.
*
* 자동 형 변환은 is 연산 기호와 함께 사용하는 게 좋습니다. 참고로 논리 && 연산식은 양쪽의 조건을 동시에 조사하는게 아니라 왼쪽 조건부터 먼저 검사합니다.
* 따라서 중요한 조건은 논리 AND 연산식의 왼쪽에 작성해야 합니다.*/

fun main() {
    val str:Any
    str = "Hello, Kotlin" // String 타입으로 인식
    if (str is String && str.length > 0)
        println(str.length) // 13
}