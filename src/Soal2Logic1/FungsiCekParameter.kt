package Soal2Logic1

fun cekParameter(param: Any): String {
    return when (param) {
        is String -> "Parameter $param adalah String!"
        is Int, is Long, is Double, is Float, is Short, is Byte -> "Parameter $param adalah Number!"
        is Boolean -> "Parameter $param adalah Boolean!"
        is Array<*> -> "Parameter ${param.joinToString(", ")} adalah Array!"
        is Map<*, *> -> "Parameter [object Object] adalah Array!"
        else -> "Parameter $param adalah Object!"
    }
}

fun main() {
    println(cekParameter(arrayOf(1, 2, 9)))
    println(cekParameter(mapOf("nama" to "Rudi", "umur" to 20)))
}
