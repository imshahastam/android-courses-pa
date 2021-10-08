import java.lang.ArithmeticException

fun main() {

    //Shahzada Stamova
    var ff: String
    var i1: Double
    var i2: Double

    println("What operation?")
    ff = readLine().toString()

    when (ff) {
        "+" -> print("Сложение ${i1 + i2}")
        "-" -> print("Вычитание ${i1-i2}")
        "*" -> print("Умножение ${i1*i2}")
        "/" -> divide()
    }
}

private fun divide(){
    var i1: Double = readLine()!!.toDouble()
    var i2: Double = readLine()!!.toDouble()
    println(div(i1, i2))
}

private fun div(i1: Double, i2: Double): String {
    try {
        println("res = ${i1 / i2}")
    } catch (e: ArithmeticException) {
        "Don't 0!"
    }
}

//private fun String.parseToInt(): Int {
//    if (this == "") return 0
//    //
//    return
//}