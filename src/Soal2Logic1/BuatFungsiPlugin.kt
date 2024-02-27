package Soal2Logic1

fun plugin(number: Int) {
    println("plugin($number)")
    for (i in 1..number) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("plugin")
            i % 3 == 0 -> println("plug")
            i % 5 == 0 -> println("in")
            else -> println(i)
        }
    }
}

fun main() {
    val number = 15
    plugin(number)
}
