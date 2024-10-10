
class Country(val countryName: String, val nationality: String)

val countries = listOf(
    Country("США", "Американец"),
    Country("Россия", "Русский"),
    Country("Япония", "Японец")
)

fun findNationality(countryCode: String): String {
    return countries.find { it.countryName == countryCode }?.nationality ?: "Информация о стране отсутствует"
}

fun main() {
    val countryCode = readLine()!!
    println(findNationality(countryCode))
}
