package com.example.udemykotlincourse

//lambda is an anonym function that can be passed as parameter
//{ parametros -> corpo }
//lambda <> anonymn class

//const is used just in top level declarations



fun main() {

    //lambda
    val a = {x: Int, y: Int ->
        x*y
    }

    test { a(5, 5) }
}

fun test(lambda: () -> Int){
    println(lambda())
}