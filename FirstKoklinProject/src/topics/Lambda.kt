package topics

fun main() {
    val list = listOf(1,2,3,4,5)

    list.forEach{e -> println(e)}
    println(list.map{e-> e * 2})
    println(list.filter{e-> e % 2 == 0})
    println(list.reduce{sum, e -> sum + e})

    println(list.sortedDescending())
    println(list.any{it>10}) //false
    println(list.all{it<10}) //true

    val numbers = listOf(2, -3, 4, 7, 11, -1)
    val (positive, negative) = numbers.partition {it>0}
    println(positive)
    println(negative)

    val result = listOf("a", "b", "ab", "ccc", "ad").groupBy { it.length }
    println(result)
}