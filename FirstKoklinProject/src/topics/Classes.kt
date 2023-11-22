package topics

import java.awt.Rectangle

fun main() {
    var rectangle1 = rectangle(5.0, 2.0)
    println(rectangle1.perimeter)
    println(rectangle1.square())

}

class rectangle(var length:Double, var height:Double) {
    var perimeter = (length + height) * 2

    fun square() = length * height

}