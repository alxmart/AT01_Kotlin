package com.luizafmartinez.at01_kotlin.lesson03

class Game_CompanionObject {
    companion object {
        val gamesPlayed = 10
    }
}

fun main() {
    println(Game_CompanionObject.gamesPlayed)
}