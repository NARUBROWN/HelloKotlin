package kotlinConstrucotr

// constructor는 (주생성자) 키워드 생략가능
class Person constructor(
    private val name: String,
    private var age: Int,
    private var isMarried: Boolean,
) {
    var nickname: String = ""
    init {
        println("결혼 여부 = $isMarried")
    }
    fun getName() = println("Your name is $name")

    constructor(_name: String, _age: Int, _isMarried: Boolean, _nickname: String)
    : this(_name, _age, _isMarried) {
        nickname = _nickname
    }
}

fun main() {
    val hong = Person("Hong", 23, true, "불어라 봄바람")
    hong.getName()
    println("The nickname is ${hong.nickname}")
}