package com.luizafmartinez.at01_kotlin.lesson03

fun main() {

    var myArrayList = ArrayList<Int> ()

    myArrayList.add(10)
    myArrayList.add(20)
    myArrayList.add(30)

    println(myArrayList)

    println(myArrayList.get(0))

    for (num in myArrayList) {
        println(num)
    }

    for (index in 0.. myArrayList.size-1) {
        println(index)
    }

    if (myArrayList.contains(30)) {
        println("Number exists!!")
    }

    myArrayList.add(40)
    myArrayList.add(50)

    myArrayList.remove(50)

    for (index in 0.. myArrayList.size-1) {
        println(index)
    }

    for (num in myArrayList) {
        println(num)
    }

    myArrayList.set(1, 1000)

    for (num in myArrayList) {
        println(num)
    }

    var x =arrayOf(100,200,300,400,500)

    for (index in x){
        println(index)
    }

    var mylist= mutableListOf<Any>(1,"Android",500)

    for (index in 0..mylist.size-1) {

        println(mylist[index])
    }

    mylist[0] = 250

    for (index in 0..mylist.size-1) {

        println(mylist[index])
    }



}