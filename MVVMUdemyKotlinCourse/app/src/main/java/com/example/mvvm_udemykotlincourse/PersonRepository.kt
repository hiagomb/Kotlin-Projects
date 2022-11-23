package com.example.mvvm_udemykotlincourse

class PersonRepository {


    fun login(email: String, password: String): Boolean{
        return (!email.isEmpty() && !password.isEmpty())
    }
}