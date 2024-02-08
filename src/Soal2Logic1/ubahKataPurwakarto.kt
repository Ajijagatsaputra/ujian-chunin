package Soal2Logic1

fun ubahHuruf(input: String): String {
    // Ubah huruf 'a' menjadi 'o' dalam kata
    val kataBaru = input.replace('a', 'o')
    return kataBaru
}

fun main(){
    val kataAwal= "Purwakarta"
    val kataBaru = ubahHuruf(kataAwal)
    println("ubahKata(o)")
    println("Kata sebelumnya: $kataAwal")
    println("Kata setelah diubah: $kataBaru")
}