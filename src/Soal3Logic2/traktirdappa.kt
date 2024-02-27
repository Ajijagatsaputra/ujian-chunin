package Soal3Logic2

fun main() {
    val hargaMakanan = 150000
    val kodePromo = "PLUGIN50" // Ganti dengan kode promo yang digunakan
    val jarakPengirimanKm = 5 // Ganti dengan jarak pengiriman dalam kilometer
    val restoranPajak = true // Ganti dengan kondisi restoran apakah dikenakan pajak atau tidak

    val potongan = hitungPotongan(hargaMakanan, kodePromo)
    val biayaAntar = hitungBiayaAntar(jarakPengirimanKm)
    val pajak = hitungPajak(hargaMakanan, restoranPajak)

    val subTotal = hargaMakanan - potongan + biayaAntar + pajak

    println("Harga : $hargaMakanan")
    println("Potongan : $potongan")
    println("Biaya Antar : $biayaAntar")
    println("Pajak : $pajak")
    println("Sub Total : $subTotal")
}

fun hitungPotongan(hargaMakanan: Int, kodePromo: String): Int {
    return when (kodePromo) {
        "PLUGIN50" -> {
            val potongan = hargaMakanan * 50 / 100
            if (potongan > 50000) 50000 else potongan
        }
        "DITRAKTIRPINGUIN" -> {
            val potongan = hargaMakanan * 60 / 100
            if (potongan > 30000) 30000 else potongan
        }
        else -> 0
    }
}

fun hitungBiayaAntar(jarakPengirimanKm: Int): Int {
    val biayaPertama = 5
    val biayaSelanjutnya = 3
    return if (jarakPengirimanKm <= 2){
        biayaPertama
    }else{
        biayaPertama + (jarakPengirimanKm -2) * biayaSelanjutnya
    }
}

fun hitungPajak(hargaMakanan: Int, restoranPajak: Boolean): Int {
    return if (restoranPajak) (hargaMakanan * 5 / 100) else 0
}
