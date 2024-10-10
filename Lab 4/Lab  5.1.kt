fun processPayment(paymentMethod: String): String {
    return when (paymentMethod) {
        "наличные" -> "Оплачено наличными."
        "кредитная карта" -> "Оплачено кредитной картой."
        "PayPal" -> "Оплачено через PayPal."
        else -> "Неизвестный способ оплаты."
    }
}
fun main() {
    val paymentMethod = readLine()!!
    println(processPayment(paymentMethod))
}

