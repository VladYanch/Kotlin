package topics

fun main() {
    testWhen(1)
    testWhen("str")
    testWhen(15)
}

fun testWhen (input: Any) {
    when (input) {
        1 -> println("Один")
        in 10..20 -> println(input)
        is String -> println(input.length)
    }

}