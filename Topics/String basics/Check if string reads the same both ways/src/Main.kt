import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // Read input string from the user
    val inputString = scanner.nextLine()
    val filteredString = inputString.filter { !it.isWhitespace() }
    val letters = filteredString.filter { it.isLetter()}
    val lowercasedString = letters.lowercase(Locale.getDefault())
    val reversedString = lowercasedString.reversed()
    if (reversedString == lowercasedString) {
        println("true")
    } else {
        println("false")
    }

    // TODO: Check if the input string is a palindrome
    // Ignore case and whitespace when checking
    // Print 'true' if it is a palindrome, 'false' otherwise

}