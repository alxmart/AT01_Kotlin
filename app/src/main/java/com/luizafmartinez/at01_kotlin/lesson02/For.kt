package Lesson02

fun main() {

    for (i in 0..9) {
        println("I: $i")
        if (i == 7) {
            println("Stopped at $i")
            break

        }
    }

    var vector = arrayOf(100, 200, 300, 400, 500, 600, 700)
    for (index in 0..6) {
        println(vector[index])
    }

    var x = 0
    do {
        x++
        if (x == 3) {
            continue
        }
        println("x= $x")
    } while (x <= 10)

}
