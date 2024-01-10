package kotlinClassInheritance

open class Animal {
    var name:String = ""
    var color:String = ""
    open fun eat() {
        println("Eat")
    }
}

class Dog(val dog_name:String):Animal() {
    var breed:String = ""
    fun bark() {
        println("Bark")
    }
    override fun eat() {
        println("$name eats food")
    }
    init {
        this.name = dog_name
    }
}

class cat:Animal() {
    var age:Int = 0
    fun meow() {
        println("Meow")
    }
    override fun eat() {
        println("$name eats food")
    }
}

fun main() {
    val dog = Dog("바둑이")
    println(dog.name)
}