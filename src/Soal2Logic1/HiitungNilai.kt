package Soal2Logic1

fun main (){
    println("Program Menghitung Rata-Rata UN dan Grade")

    // Input nilai UN
    print("Masukkan nilai Bahasa Indonesia: ")
    val nilaiBahasaIndonesia = readLine()?.toIntOrNull()
    print("Masukkan nilai Bahasa Inggris: ")
    val nilaiBahasaInggris = readLine()?.toIntOrNull()
    print("Masukkan nilai Matematika: ")
    val nilaiMatematika = readLine()?.toIntOrNull()
    print("Masukkan nilai IPA: ")
    val nilaiIPA = readLine()?.toIntOrNull()

    // Validasi input
    if (nilaiBahasaIndonesia != null &&
        nilaiBahasaInggris != null &&
        nilaiMatematika != null &&
        nilaiIPA != null
    ) {
        // Hitung rata-rata
        val rataRata = (nilaiBahasaIndonesia + nilaiBahasaInggris + nilaiMatematika + nilaiIPA) / 4.0

        // Tentukan Grade
        val grade = when (rataRata.toInt()) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            else -> "E"
        }

        println("Rata-rata nilai UN: $rataRata")
        println("Grade: $grade")
    } else {
        println("Harap masukkan nilai yang valid untuk semua mata pelajaran!")
    }
}