package com.example.convidados.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.convidados.model.Guest
import com.example.convidados.repository.GuestRepository

class AllGuestsViewModel(application: Application) : AndroidViewModel(application) {

   private val listGuests = MutableLiveData<List<Guest>>()
   fun listGuests(): LiveData<List<Guest>> = listGuests

   val repository = GuestRepository.getInstance(application)

   fun getAll(){
      listGuests.value = repository.getAll()
   }


}