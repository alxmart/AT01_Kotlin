package Lesson01

fun main() {

    println("=========================================")
    println("Welcome to Kotlin Calculator")
    println("=========================================")

    println("Enter the first number:")
    var a = Integer.valueOf(readLine())

    println("Enter the Second number:")
    var b = Integer.valueOf(readLine())

    var c = a + b
    var d = a * b
    var e = a / b

    println("The Sum Result = $c")
    println("The Multiplication Result = $d")
    println("The Division Result = $e")
    println("========================================================")
}
