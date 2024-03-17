package com.luizafmartinez.at01_kotlin.lesson03

fun main (){

    val x = Permission_Generic_Class<String> ()
    x.userName = "lenny@androidcompany.com"
    x.password = "Sampa@1234"
    println("User Name: ${x.userName}  & Password: ${x.password}")

    val y = Permission_Generic_Class<String> ()
    y.userName = "homer@springfield.com"
    y.password = 123456.toString()
    println("User Name: ${y.userName}  & Password: ${y.password}")

    val z = Permission_Generic_Class<Int>()
    z.iD = 1031
    println("User ID: ${z.iD} ")}