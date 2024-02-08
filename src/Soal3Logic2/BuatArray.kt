package Soal3Logic2

fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false
    }
    for (i in 2 until n) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}

fun deretAcak(size: Int): Pair<List<Int>, Int> {
    val primeNumbers = mutableListOf<Int>()

    // Menyaring bilangan prima 1-30
    for (num in 2..30) {
        if (isPrime(num)) {
            primeNumbers.add(num)
        }
    }

    // Mengambil angka secara acak dari bilangan prima
    val randomPrimes = List(size) { primeNumbers.random() }

    // Menghitung total dari deret angka prima yang terpilih secara acak
    val total = randomPrimes.sum()

    return Pair(randomPrimes, total)
}

fun main() {
    val size = 5
    val (randomPrimes, total) = deretAcak(size)

    println("Contoh input: deretAcak($size)")
    println("Contoh output: $randomPrimes")
    println("Total: $total")
}
