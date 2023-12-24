package startKotlin

/*
*   함수형 프로그램에서는 한 개의 파일에 여러 개 함수를 정의할 수 있지만, 반드시 main() 함수를 포함해야 함.
*/

fun main() {
    println("Hello Kotlin")
    makePerson()
}

/*
* 함수 + 클래스
* 하나의 프로그램에 클래스와 함수가 같이 있는 구조. java는 OOP 언어이기 때문에 클래스 이름과 파일 이름이 같아야 하지만,
* 코틀린에서는 클래스 이름을 지정하지 않아도 됨 (코틀린은 다중 패러다임 언어이기 떄문)
* */

class Person(var name:String, var age:Int)

fun makePerson() {
    var hong = Person("홍길동", 24)
    println(hong.age)
}