
val word1 = "короткий"
val word2 = "средний"
val word3 = "длинный"

fun determineLength(word: String): String {
    return when (word.length) {
        0 -> "пустая строка"
        1 -> "односимвольная строка"
        2 -> "двухсимвольная строка"
        3 -> "трехсимвольная строка"
        else -> "строка большей длины"
    }
}

// Пример использования
println(determineLength(word1)) // Выведет "короткий"
println(determineLength(word2)) // Выведет "средний"
println(determineLength(word3)) // Выведет "длинный"
