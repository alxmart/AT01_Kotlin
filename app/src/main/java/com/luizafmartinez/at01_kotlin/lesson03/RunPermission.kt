package com.luizafmartinez.at01_kotlin.lesson03

fun main (){

    val x = Permission<String> ()

    x.userName = "lenny@androidcompany.com"
    x.password = "Toronto@1234"
    println("User Name: ${x.userName}  & Password: ${x.password}")

    val y = Permission<String> ()

    y.userName = "homer@springfield.com"
    y.password = 123456.toString()
    println("User Name: ${y.userName}  & Password: ${y.password}")

    val z = Permission<Int>()

    z.iD = 2022
    println("User ID: ${z.iD} ")}