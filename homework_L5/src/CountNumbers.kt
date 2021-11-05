import kotlin.properties.Delegates

// эт домашка 4го урока)

//Shahzada Stamova
fun main(){

    var num = readLine()!!.toCharArray()
    val last = num.last()
    val indexOfLast = num.indexOf(last) + 1

    println("Число ${num.toList()} содержит $indexOfLast цифр(ы)")
    
    // < 444
    // > Число [4, 4, 4] содержит 1 цифр(ы) 
}

