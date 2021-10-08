fun main() {

    //Shahzada Stamova
    var i1: Double
    var i2: Double
    var ff: String

    println("Enter first number: ")
    i1 = readLine()!!.toDouble()
    println("Enter second number: ")
    i2 = readLine()!!.toDouble()

    println("What operation?")
    ff = readLine().toString()

    when (ff) {
        "+" -> print("Сложение ${i1 + i2}")
        "-" -> print("Вычитание ${i1-i2}")
        "*" -> print("Умножение ${i1*i2}")
        "/" -> print("Деление ${i1/i2}")
    }
}