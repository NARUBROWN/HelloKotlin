package kotlinGetterAndSetter

class Person {
    val name:String = "Kim"
    var age:Int = 13
}

class CityPerson {
    val name:String = "Kim"
    val age:Int = 12
    val description:String
        get() = "I am ${this.age} year's old."  // 사용자 정의 getter
}

class IncheonPerson {
    val name:String = "Kim"
    var age:Int = 12
    var nickname:String = "Super Sonic"
        set(newValue) {
            field = "Currently my nickname is changed to ${newValue}" // 사용자 정의 setter
        }
}

fun main() {
    val kim = Person()
    kim.age = 12 // setter 호출
    println("${kim.name}, ${kim.age}") // getter 호출

    val cityPerson = CityPerson()
    println(cityPerson.description)
}