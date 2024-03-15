package Lesson01

fun main() {

    println("=========================================")
    println("Welcome to Kotlin Calculator")
    println("=========================================")

    println("Enter the first number:")
    var x = Integer.valueOf(readLine())

    println("Enter the Second number:")
    var y = Integer.valueOf(readLine())

    var z = x + y
    var a = x * y
    var b = x / y

    println("The Sum Result= $z")
    println("The Multiplication Result=$a")
    println("The Division Result= $b")
    println("========================================================")
}
