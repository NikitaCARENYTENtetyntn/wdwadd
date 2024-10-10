import java.time.LocalTime

fun main() {
    val timeString = readLine()!!
    val time = LocalTime.parse(timeString)
    
    when (time.hour) {
        in 0..5 -> println("Ночь")
        in 6..11 -> println("Утро")
        in 12..17 -> println("День")
        in 18..23 -> println("Вечер")
    }
}
