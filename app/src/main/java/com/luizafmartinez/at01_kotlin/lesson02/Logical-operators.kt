package Lesson02

fun main() {

    var Age = 18
    var points = 7030
    var birth = 1997

    if (Age >= 18 || birth >= 1997)
        println("Access granted")
    else println("Access denied")

    if (Age >= 18 && points >= 2000)
        println("Promotion !!")
    else println("Original price")

}