fun main() {
    print("Введите числа ")
    var numbers = readLine()?.split(" ")

    println("самое маленькое ${numbers!!.minOrNull()} число" )
}
