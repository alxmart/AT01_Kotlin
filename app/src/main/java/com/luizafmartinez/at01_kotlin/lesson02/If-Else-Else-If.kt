package Lesson02

fun main() {

    var x = 11
    if (x > 30) println(" IF running")
    else println("Else running")

    var score: Int = 98
    var grade: String?

    if (score >= 90) grade = "Grade A"
    else if (score >= 80) grade = "Grade B"
    else if (score >= 70) grade = "Grade C"
    else if (score >= 50) grade = "Grade D"
    else grade = "Grade F"

    println(grade)

}