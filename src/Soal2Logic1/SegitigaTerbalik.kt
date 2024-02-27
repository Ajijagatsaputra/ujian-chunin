//package Soal2Logic1
//
//fun  main (){
//    val rows = 6
//
//    for (i in 0 until rows){
//        for (j in 0 until i){
//            print("  ")
//        }
//        for (k in 0 until rows - i){
//            print("* ")
//        }
//        println()
//    }
//
//    for (i in 0 until rows){
//        for (j in 0 until rows - i - 1){
//            print("  ")
//        }
//        for (k in 0 until i + 1){
//            print("* ")
//        }
//        println()
//    }
//}

fun main(){
    val rows = 6

    for (i in 1..rows){
        for (j in 1..rows - i){
            print("   ")
        }

        //cetak bintang
        for (k in 1..(2 * i - 1 )){
            print("** ")
        }
        println()
    }

    for (i in rows downTo 1) {
        // Cetak spasi sebelum bintang
        for (j in 1..rows - i) {
            print("   ")
        }

        // Cetak bintang
        for (k in 1..(2 * i - 1)) {
            print("** ")
        }

        // Baris baru setelah selesai mencetak satu baris bintang
        println()
    }
}