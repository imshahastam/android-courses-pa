import kotlin.properties.Delegates

fun main(){

    var num = readLine()!!.toCharArray()
    val last = num.last()
    val indexOfLast = num.indexOf(last) + 1

    println("Число ${num.toList()} содержит $indexOfLast цифр(ы)")
}

