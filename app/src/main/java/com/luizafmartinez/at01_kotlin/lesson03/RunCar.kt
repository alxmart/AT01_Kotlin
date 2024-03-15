package com.luizafmartinez.at01_kotlin.lesson03

fun main() {

    var japaneseCar = Car()
    japaneseCar.type = "Toyota"
    japaneseCar.maxSpeed = 230
    japaneseCar.numberOfSeats = 4

    println("Car type: ${japaneseCar.type}")
    println("Car max speed: ${japaneseCar.maxSpeed}")
    println("Car Seats: ${japaneseCar.numberOfSeats}")
}