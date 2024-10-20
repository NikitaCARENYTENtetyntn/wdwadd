fun main() {
    print("Введите первое число: ")
    val number1 = readLine()!!.toInt()!!.toFloat();
    print("Введите второе число: ")
    val number2 = readLine()!!.toInt()!!.toFloat();

    val summ1 = number1 + number2;
    val summ2 = number1 - number2;
    val summ3 = number1 * number2;
    val summ4 = number1 / number2;

    print("Сумма сложение равна: ")
    println(summ1)
    print("Сумма вычитание равна: ")
    println(summ2)
    print("Сумма умножение равна: ")
    println(summ3)
    print("Сумма деление равна: ")
    println(summ4)
}
