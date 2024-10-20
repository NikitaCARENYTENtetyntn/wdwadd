fun main() {
    print("Введите значение: ")
    var list = readLine()!!.split(' ')

    print(message = "Сумма всех этих элементов равна: ")
    println(list.sumOf { it.toInt() })

}
