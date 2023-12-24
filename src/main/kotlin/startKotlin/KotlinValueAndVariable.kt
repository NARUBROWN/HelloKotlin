package startKotlin

fun main() {
    // val은 value의 약자로 immutable(불변) 또는 read-only 변수입니다.
    val a:Int = 1 // 값 할당
    val b = 2 // Int 타입 추론
    val c:Int // 초기값을 할당하지 않았을 때는 반드시 Type을 선언해야 함
    c = 3 // 초기값 할당
}

fun variable() {
    // var는 variable의 약자로 mutable(가변) 또는 writeable 변수입니다.
    var x = 5 // Int 타입 추론
    x += 1 // 값 변경

    /*
    * var 변수의 값을 바꾸면 메모리에 저장된 값을 업데이트 하는 것 같지만, 새 메모리 공간을 할당해 변경된 값을
    * 저장하는 경우도 있습니다. 대표적으로 String 타입이 그러합니다. (원래 값은 쓰레기가 됨)
    * */
}