fun main() {
    print("Type a number to see if that is a prime: ")
    val (num, rep) = readln().let { Pair(it, "1".repeat(it.toInt())) }
    println("$num is ${if (Regex("1?|(11+?)\\1+").matches(rep)) "not " else ""}a prime")
    println("\nThe prime numbers up to 100:")
    for (i in 0..100) {
        if (!Regex("1?|(11+?)\\1+").matches("1".repeat(i))) {
            println(i)
        }
    }
}