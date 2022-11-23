package com.example.mvvm_udemykotlincourse

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {


    private var textWelcome = MutableLiveData<String>()
    private var login = MutableLiveData<Boolean>()
    private val personRepository = PersonRepository()

    init {
        textWelcome.value = "Olá"
    }

    fun welcome(): LiveData<String> =  textWelcome
    fun login(): LiveData<Boolean> = login

    fun doLogin(email: String, password: String){
        login.value = personRepository.login(email, password)
    }



}