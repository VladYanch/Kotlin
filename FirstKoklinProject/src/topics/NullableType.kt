package topics


fun main() {
    val str:String = "Hello"
    println(str.length)

    var s:String? = null
    println(s?.length)
    s = "Goodbye"
    println(s?.length)

    s = null
    // elvis ?:
    var l = s?.length ?: -1
    println(l)

    // !! выбрасывает NPE если данные null
    s = if((0..10).random() >5 ) "asdf" else null
    var t = s!!.length
    println(t)
}