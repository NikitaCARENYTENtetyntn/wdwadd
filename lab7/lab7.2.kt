fun main() {
    print("Введите слово: ")
    var string = readLine()

    if (string == string!!.reversed()) {
        print("Вы нашли слово палиндром")
    }else{
        print("Это не словов палиндром")
    }
}
