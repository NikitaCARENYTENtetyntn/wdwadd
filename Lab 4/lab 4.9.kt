
enum class FoodType { EGG, POTATOES, MEAT, VEGGIES }

const val COOKING_TIMES = mapOf(
    FoodType.EGG to 5L,
    FoodType.POTATOES to 20L,
    FoodType.MEAT to 30L,
    FoodType.VEGGIES to 15L
)

fun main() {
    val foodType = readLine()!!.lowercase()
    val cookingTime = COOKING_TIMES[FoodType.valueOf(foodType)] ?: throw IllegalArgumentException("Неизвестный тип пищи")
    println("Время приготовления: $cookingTime минут")
}
