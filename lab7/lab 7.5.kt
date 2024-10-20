fun main() {
    print("Введите первое число: ")
    var number1 = readLine()!!.toInt()
    print("Введите второе число: ")
    var number2 = readLine()!!.toInt()

    if  (number1 == number2) {
        print("True")
    }else{
        print("False")
    }
}
