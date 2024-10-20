fun findDifferenceFold(numbers: List<Int>): Int {
    require(numbers.isNotEmpty()) { "Список не может быть пустым" }
    return numbers.fold(Pair(Int.MAX_VALUE, Int.MIN_VALUE)) { acc, i ->
        Pair(minOf(acc.first, i), maxOf(acc.second, i))
    }.let { (min, max) -> max - min }
}

fun main() {
    print("Введите значения: " )
    val numbers = readLine()!!.split(" ").map { it.toInt() }
    val difference = findDifferenceFold(numbers)
    println("Разница между максимальным и минимальным значениями: $difference")
}
