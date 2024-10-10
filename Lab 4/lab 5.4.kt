
enum class ErrorCode(val description: String) {
    ERROR_100("Ошибка сети"),
    ERROR_200("Ошибка сервера"),
    ERROR_300("Ошибка базы данных")
}

fun displayErrorMessage(errorCode: ErrorCode): String {
    return errorCode.description
}

fun main() {
    val errorCode = readLine()!!.toInt()
    val errorDescription = displayErrorMessage(ErrorCode.values()[errorCode])
    println(errorDescription)
}
