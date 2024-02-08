package Soal2Logic1

fun main() {
    val rows = 6 // Jumlah baris segitiga

    // Loop untuk setiap baris
    for (i in 0 until rows) {
        // Loop untuk spasi
        for (j in 0 until i) {
            print("  ")
        }
        // Loop untuk mencetak simbol '*' dari rows - i sampai 1
        for (k in 0 until rows - i) {
            print("* ")
        }
        // Baris baru setelah setiap baris selesai
        println()
    }
    println() // Baris kosong antara segitiga

    // Loop untuk setiap baris (segitiga ke-2)
    for (i in 0 until rows) {
        // Loop untuk spasi
        for (j in 0 until rows - i - 1) {
            print("  ")
        }
        // Loop untuk mencetak simbol '*' dari 1 sampai rows - i
        for (k in 0 until i + 1) {
            print("* ")
        }
        // Baris baru setelah setiap baris selesai
        println()
    }
}
