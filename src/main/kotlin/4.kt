fun main() {
    println("Введите выражение (число1 операция число2):")
    val expression = readln() ?: return
    val parts = expression.split(" ")
    if (parts.size != 3) {
        println("Некорректный формат выражения")
        return
    }

    val num1 = parts[0].toDoubleOrNull()
    val num2 = parts[2].toDoubleOrNull()
    val operator = parts[1]

    if (num1 == null || num2 == null) {
        println("Некорректные числа")
        return
    }

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 == 0.0) {
                println("Деление на ноль недопустимо")
                return
            }
            num1 / num2
        }
        else -> {
            println("Некорректный оператор")
            return
        }
    }

    println("Результат: $result")
}