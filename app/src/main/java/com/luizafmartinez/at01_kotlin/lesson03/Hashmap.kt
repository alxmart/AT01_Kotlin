package com.luizafmartinez.at01_kotlin.lesson03

fun main() {

    //var myhashmap = HashMap<String, String> ()
    /*var myhashmap = HashMap<Any, Any> ()

    myhashmap.put("Ok", "Okay")
    myhashmap.put("Y", "Yes")
    myhashmap.put("and", "Android")
    myhashmap.put("Goo", "Google")*/

    var myhashmap =hashMapOf <String, String> (
        "Ok" to "Okay",
        "Y" to "Yes",
        "a" to "Android",
        "Goo" to "Google"
    )

  /*  println(myhashmap.get("Ok"))
    println(myhashmap.get("Y"))
    println(myhashmap.get("and"))
    println(myhashmap.get("Goo"))*/

    for (x in myhashmap.keys) {
        println(myhashmap.get(x))
    }

}