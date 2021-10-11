//Shahzada Stamova
fun main() {

    val myArray = intArrayOf(5, 2, 6, 7, 9, 6, 1, 8, 4, 3)
    println(myArray.toList())
    myArray.bubbleSort()
    println("Sorted ${myArray.toList()}")

}
fun IntArray.swaping(i1: Int, i2: Int) {
    val buffer = this[i1]
    this[i1] = this[i2]
    this[i2] = buffer
}

fun IntArray.bubbleSort() {
    var sorted = false
    while (!sorted) {
        sorted = true
    for (i in 1 until this.size)
    {
        val current = this[i]
        val previous = this[i - 1]
        if (previous > current) {
            this.swaping(i-1, i)
            sorted = false
        }
    }
    }
}