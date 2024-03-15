package Lesson02

fun main() {

    println("=========== Pizza Order ==============")
    println("Enter the Pizza Size : \n1=> Small Size, \n2=> Medium Size, \n3=> Large Size")

    var size= readLine()!!.toInt()
    var price: Int? = null

    when (size) {
        1-> price = 5
        2-> price = 7
        3-> price = 10
        else-> println("You did not enter the correct size")
    }
    println("Total Price = US$ $price")}