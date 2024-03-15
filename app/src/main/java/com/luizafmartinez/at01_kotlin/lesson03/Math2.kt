package com.luizafmartinez.at01_kotlin.lesson03

class Math2 : Calc {

    override fun sum(x: Int, y: Int) {

        var sumTotal = x + y
        println("Sum Total: $sumTotal")
    }

    override fun multiply(a: Int, b: Int) {

        var multi = a * b
        println("Multiply: $multi")
    }
}