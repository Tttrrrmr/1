fun main() {
    println("Введите первую цифру:")
    val digit1 = readln()?.toIntOrNull() ?: return
    println("Введите вторую цифру:")
    val digit2 = readln()?.toIntOrNull() ?: return

    if (digit1 == digit2) {
        println("Введены одинаковые цифры, создать нечетное число невозможно")
    } else {
        val result = if (digit1 % 2 == 0) {
            digit1 * 10 + digit2
        } else {
            digit2 * 10 + digit1
        }
        println("Результат: $result")
    }
}