fun main() {
    println("Введите натуральное число:")
    val input = readln()?.toIntOrNull() ?: return
    if (input < 0) {
        println("Число должно быть натуральным")
        return
    }
    val binary = Integer.toBinaryString(input)
    println("Двоичное представление: $binary")
}