package com.example.motivation_udemyktolincourse

import android.content.Context
import android.content.SharedPreferences

class MySharedPreferences(context: Context) {

    private val sharedPreferences: SharedPreferences = context.getSharedPreferences("Motivation", Context.MODE_PRIVATE)

    fun saveField(key: String, value: String){
        sharedPreferences.edit().putString(key, value).apply()
    }

    fun getField(key: String) = sharedPreferences.getString(key, "") ?: ""
}