fun main() {
    println("Введите строку:")
    val input = readln() ?: return
    val charCountMap = mutableMapOf<Char, Int>()

    for (char in input) {
        charCountMap[char] = charCountMap.getOrDefault(char, 0) + 1
    }

    val sortedChars = charCountMap.keys.toList().sorted()
    for (char in sortedChars) {
        println("$char - ${charCountMap[char]}")
    }
}