import java.lang.ArithmeticException

//Shahzada Stamova

var i1: Double = 0.0
var i2: Double = 0.0

fun main() {

    try {
        println("Введите первое число: ")
        i1 = readLine()!!.toDouble()
        println("Введите второе число:")
        i2 = readLine()!!.toDouble()
    } catch (e: NumberFormatException) {
        println("Вводите только число!")
    }

    println("Какая операция?")
    val operation = readLine().toString()

    when (operation) {
        "+" -> print("Сложение = ${i1+i2}")
        "-" -> print("Вычитание = ${i1-i2}")
        "*" -> print("Умножение = ${i1*i2}")
        "/" -> divide()
    }
}

private fun divide(){
    div(i1, i2)
}

private fun div(i1: Double, i2: Double) {
    try {
        println("Деление = ${i1 / i2}")
    } catch (e: ArithmeticException) {
        println("На ноль делить нельзя!")
    }
}
