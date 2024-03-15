package Lesson02

fun main() {

    println("=========== Pizza Order ==============")
    println("Enter the Pizza Size : \n1=> Small Size, \n2=> Medium Size, \n3=> Large Size")

    var size= readLine()!!.toInt()

    var price: Double? = null

    when (size) {
        1-> price = 5.00
        2-> price = 7.00
        3-> price = 10.00
        else-> println("Please, enter a valid size")
    }
    println("Total Price = US$ $price")}