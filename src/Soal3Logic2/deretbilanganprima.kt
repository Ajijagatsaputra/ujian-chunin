package Soal3Logic2

fun main() {
    val deret = deretAcak(5)
    println("Deret angka prima acak: ${deret.toList()}")
    println("Total: ${deret.sum()}")
}

fun deretAcak(n: Int): List<Int> {
    val angkaPrima = mutableListOf<Int>()
    var num = 2
    while (angkaPrima.size < n) {
        if (isPrime(num)) {
            angkaPrima.add(num)
        }
        num++
    }
    return angkaPrima
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    if (num == 2) return true
    if (num % 2 == 0) return false
    var i = 3
    while (i * i <= num) {
        if (num % i == 0) return false
        i += 2
    }
    return true
}
