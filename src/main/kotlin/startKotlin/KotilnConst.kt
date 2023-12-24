package startKotlin

// constant(상수)란 값이 바뀌지 않는 점에서는 val 변수와 비슷합니다.
// 그러나 val 앞에 키워드 const를 붙여야 하며, 이름은 상수를 강조하기 위해 대문자를 사용합니다.
const val MY_KEY = 1234 // 타입 생략
fun main() {
    println(MY_KEY)
}