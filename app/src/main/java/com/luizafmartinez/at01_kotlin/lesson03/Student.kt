package com.luizafmartinez.at01_kotlin.lesson03

open class Student(
    recebeName: String,
    recebeCollege: String,
    recebeAge: Int
) {
    var name: String? = recebeName
    var college: String? = recebeCollege
    var age: Int? = recebeAge
}