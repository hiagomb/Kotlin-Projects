package com.example.courserakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    //Kotlin is a typed lanaguage, but you don´t need to explicit var/val types
    //VARIABLES
    val TESTE= "This is a constant"   //val (value) == final
    var teste= "This is mutable"
    var list= listOf(1, 2, 3)

    //:Unit == void
    //top level functions == static functions

    fun max(num1: Int= 0, num2: Int): Int{ //the first parameter has a default value, so its optional to pass it
        return if(num1 > num2) num1 else num2
    }


    //if: expression
    //when == switch

    fun loopsTest(){
        while(teste.equals("")){
            println("")
        }
        for(i in list){
            println(i)
        }
    }



}