package Lesson01

fun main() {

    println("=========================================")
    println("Welcome to Calculator")
    println("=========================================")

    println("Enter number:")
    var x = readLine()!!.toInt()      //non-null asserted (!!.)

    println("Enter second number:")
    var y = readLine()!!.toInt()

    println("Sum: ${ x + y }")
    println("Subtraction:  ${ x - y }")
    println("Multiplication: ${ x * y }")
    println("Division:  ${ x / y }")

    println("========================================================")}