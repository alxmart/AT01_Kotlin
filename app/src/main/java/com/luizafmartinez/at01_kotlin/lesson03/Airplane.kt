package com.luizafmartinez.at01_kotlin.lesson03

open class Airplane() {

    private var type: String? = null
    private var capacity: Int? = null
}

class Bus(): Airplane()

var volvo_bus = Bus()


fun main() {

   // println(volvo_bus.capacity) //Cannot acess capacity -> private


}