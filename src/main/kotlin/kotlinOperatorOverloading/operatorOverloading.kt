package kotlinOperatorOverloading

class Point(val x:Int, val y:Int) {
    operator fun times(p:Point):Point { // kotlin에서는 예약어를 통해 Operator Overloading을 수행할 수 있음
        return Point(x*p.x, y*p.y)
    }
}
fun isPositive(n:Int) = if (n > 0) "Positive" else "Negative"
fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(3, 4)
    val p3 = p1 * p2
    println("${p3.x}, ${p3.y}")


    val bool = false
    println("b = $bool, !b = ${bool.not()}")

    val a = 3
    println(a.unaryPlus()) // +3

    val b = a.unaryMinus() // -3
    println("$a is ${isPositive(a)}")
    println("$b is ${isPositive(b)}")

    println(a.inc()) // 증가 연산자
    println(a.dec()) // 감소 연산자


}