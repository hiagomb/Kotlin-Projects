package com.example.udemykotlincourse

//Collections: list, set and map


fun main() {

    //list**************************************************************************************************************************
    val list = listOf(1, 2, 3) //it cannot be modified
    val muList = mutableListOf(1, 2, 3) //it can be modified

    muList.add(2)

    println(list.maxOf { it })
    list.filter { it > 1 }.forEach { println(it) }


    //set*****************************************************************************************************************************
    val set = setOf<String>("Madrid", "Paris", "Madrid") //set does not allow duplicated values and is not ordered
    val muSet = mutableSetOf<Int>()

    println(set)

    //map*****************************************************************************************************************************
    val map= mapOf<String, String>(Pair("city", "Los Angeles"), Pair("language", "english"))
    val muMap = mutableMapOf<String, String>()

    muMap.put("country", "Brasil")

}