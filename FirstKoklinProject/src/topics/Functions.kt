package topics

import java.util.*

fun main() {
    println(testSimple()) //10
    println(sum(3,10)) //13
    println(testString(15)) //String is 15
    println(testNamedArguments(y=2, x=1, z=3)) // 1,2,3 порядок не важен для именованных элементов
    testDefaultArguments() // 3 тк. по умолчанию 1+2
    testDefaultArguments(y=3) //4
    testDefaultArguments(2,3) //5
    println(foo("vlAd", 51, true)) // VLAD 51
    println(foo("vlAD")) // vlAD 50
    printEven(1, 2, 3, 4, 5, 6, 7, 8) //2,4,6,8
    println("-".repeat(50))
    printEven(*intArrayOf(1, 4, 8, 3, 5), 6, 7) //4, 8, 6

}

fun testSimple():Int {
    return 5 + 5
}

//fun testSimple():Int = 5 + 5 // короткая запись простой функции в одно действие

//fun sum(x:Int, y:Int):Int = x + y // полный вариант записи
fun sum(x:Int, y:Int) = x + y //можно так, так как это понятно из полученных данных

fun testString(x: Int):String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z:Int):List<Int> {
    return listOf(x, y, z)
}

// как void поэтому не указываем тип данных
fun testDefaultArguments(x:Int = 1, y: Int=2) {
    println(x + y)
}

fun foo(name:String, number: Int=50, isUpperCase:Boolean=false):String {
    return (if (isUpperCase) name.uppercase(Locale.getDefault()) else name) + " " + number
}

//vararg
fun printEven(vararg numbers: Int) {
    numbers.forEach { e -> if (e % 2 == 0) println(e) }
}