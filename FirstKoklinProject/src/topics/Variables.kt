package topics

fun main() {
//    val test1: String = "Hello"
    val test1 = "Hello" //аналог верхней строки
//    test1 = "GoolBye" нельзя т.к. val неизменяемый тип
    val num1 = 2
    var num2 = 2

    var test2 = "Hello"
    test2 = "GoolBye" // var изменяемая переменная

    println("Value of test2 $test2")
    println("Sum 2 + 2 = ${2 + 2}")
    println("Sum 2 + 2 = ${num1 + num2}")
}
