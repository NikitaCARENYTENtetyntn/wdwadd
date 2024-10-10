fun sign(num: Double): String {
    return when {
        num > 0.0 -> "+${num}"
        num < 0.0 -> "-${num}"
        else -> "0"
    }
}

fun main() {
    val input = readLine()!!.toDouble()
    println(sign(input))
}
