package Lesson01

fun main() {

    println("=========================================")
    println("Welcome to Kotlin Calculator")
    println("=========================================")

    println("Enter the first number:")
    var x = Integer.valueOf(readLine())

    println("Enter the Second number:")
    var y = Integer.valueOf(readLine())

    println("The Sum Result = ${ x + y }")
    println("The Subtraction Result = ${ x - y }")
    println("The Multiplication Result = ${ x * y }")
    println("The Division Result = ${ x / y }")

    println("========================================================")
}