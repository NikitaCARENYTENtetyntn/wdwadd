import kotlin.random.Random

fun main() {
    var random = Random

    repeat(10) {
        var randomNumber = random.nextInt(from = 1, until = 101)
        println(randomNumber)
    }
}
