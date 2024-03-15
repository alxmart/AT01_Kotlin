package Lesson02

fun main() {

    var total = 1

    while (total <= 10) {
        println("Total: $total")
        total++
    }

    do {
        println("Total: $total")
        total++
    } while (total <= 15)

}