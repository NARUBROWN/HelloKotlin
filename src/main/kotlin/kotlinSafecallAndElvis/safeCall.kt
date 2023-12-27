package kotlinSafecallAndElvis

/*코틀린에서는 변수가 널 값을 갖는지 여부를 프로그래머가 직접 지정하도록 하였다.
* 기본 값은 널 값을 갖지 않는 것이다. 변수가 널 값을 갖는 것을 허용하려면 변수를 선언할 때 타입 뒤에 물음표를 붙여야 함*/
fun main() {
    var str:String?
    str = null

    /*타입 뒤에 '?'를 붙인 변수를 선언하면, 이 변수를 사용할 때 변수 이름 뒤에 반드시'?'를 붙여야 합니다.
    * 이런 이유로 변수 이름 뒤에 '?'를 붙이는 것은 안전 호출 null safety라고 부릅니다.*/
    var str2:String? = null
    if (str2?.equals("KOTLIN") == true)
        println("안녕")
    nullCheck(str)
}

/* 함수에서 safe call로 정의한 파라미털ㄹ 전달 받을 때도 s:String?처럼 안전 호출타입으로 선언해야만 합니다.
* nullCheck는 변수 str이 null인지 조사합니다.*/
fun nullCheck(s:String?) {
    if (s == null)
        println("$s is null")
    else
        println("$s is not null")
}