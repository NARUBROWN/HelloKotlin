package kotilnStandardTypeCharAndBoolean

fun main() {
    val c:Char = 'A'
    // var c:Char = "A" ""은 불가

    /* ACSII 코드는 toChar을 사용하여 Char 타입 (=문자)로 변환할 수 있습니다.
    * 유니코드들을 나타낼 때는 접두어 '\u'를 사용합니다.
    */

    val code:Int = 65 // 문자 'A'의 ASCII 코드
    val han_code_1 = '\uac00' // 유니코드에서 첫번째 한글 음절 '가'
    val hancode_11172:Char = '\ud7a3' // 유니코드에서 마지막 한글 음절 '힣'

    println(code.toChar() + ", " + (code+1).toChar()) // A, B
    println("$han_code_1" + "$hancode_11172")
}