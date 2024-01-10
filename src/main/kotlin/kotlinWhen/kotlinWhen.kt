package kotlinWhen

import kotlin.random.Random


fun guessValue(x:Int) {
    when (x) {
        1 -> println("It is 1")
        2 -> println("It is 2")
        else -> {
            println("It is greater than or equal to 3")
        }
    }
}

enum class Color {
    RED, GREEN, BLUE
}

sealed class Shape {
    abstract fun calcuateArea():Double
    class Circle(val radius:Double):Shape() {
        override fun calcuateArea():Double {
            return Math.PI * radius * radius
        }
    }

    class Rectangle(val length:Double, val width:Double):Shape() {
        override fun calcuateArea(): Double {
            return length * width
        }
    }

    class Triangle(val base:Double, val height:Double):Shape() {
        override fun calcuateArea(): Double {
            return 0.5 * base * base
        }
    }
}

fun main() {
    val randomInt = Random.nextInt(1, 10)
    guessValue(randomInt)

    val x = Color.RED
    val color = when(x) {
        Color.RED -> "red"
        Color.GREEN -> "green"
        Color.BLUE -> "blue"
    }
    println("The color you chose is $color")

    val shape:Shape = Shape.Circle(5.0)

    val area = when(shape) {
        is Shape.Circle -> shape.calcuateArea()
        is Shape.Triangle -> shape.calcuateArea()
        is Shape.Rectangle -> shape.calcuateArea()
        // 모든 조건을 추가하면 else가 없어도 괜찮음
    }

    print("Enter the score: ")
    val score = readLine()!!.toInt()
    val grade = when (score) {
        in 90..100 -> "a"
        in 80..89 -> "b"
        in 70..79 -> "c"
        else -> 'f'
    }
    println("score: $score, grade: $grade")
}