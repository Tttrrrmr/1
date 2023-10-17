fun main() {
    println("Введите строку:")
    val input = readln() ?: return
    if (input.isEmpty()) {
        return
    }

    var currentChar = input[0]
    var charCount = 1

    for (i in 1 until input.length) {
        if (input[i] == currentChar) {
            charCount++
        } else {
            print("$currentChar${if (charCount > 1) charCount else ""}")
            currentChar = input[i]
            charCount = 1
        }
    }

    print("$currentChar${if (charCount > 1) charCount else ""}")
}