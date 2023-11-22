package topics

fun main() {
    var list = mutableListOf("apple","banana","orange")
    list.set(0, "melon")
    println("First element is ${list.get(0)}")

    println("-".repeat(50))
    // for each
    val items = listOf("apple","banana","orange") // java List.of() Java 9
    for (item in items)
        println(item)

    println("-".repeat(50))

    //while
    var index = 0
    while (index<items.size) {
        println("Items at $index is ${items[index]}")
        index++
    }
    println("-".repeat(50))

//    Диапазоны как в Pyton
    println(5 in 3 ..10) //true

    for (i in 1..10)
        println(i)

    println("-".repeat(50))
    for (i in 1 until 10) //без последнего элемента
        println(i)

    println("-".repeat(50))
    for (i in 10 downTo  1) //без последнего элемента
        println(i)

    println("-".repeat(50))
    for (i in 0 .. 100 step 10) //без последнего элемента
        println(i)
}