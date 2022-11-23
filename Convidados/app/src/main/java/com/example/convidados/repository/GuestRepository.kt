package com.example.convidados.repository

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import com.example.convidados.model.Guest
import java.lang.Exception

class GuestRepository private constructor(context: Context){

    private val guestDatabase = GuestDatabase(context)


    //Singleton
    companion object{

        private lateinit var repository: GuestRepository

        fun getInstance(context: Context): GuestRepository {
            if(!Companion::repository.isInitialized){
                repository = GuestRepository(context)
            }
            return repository
        }
    }


    fun insert(guest: Guest): Boolean{
        try{
            val values = ContentValues()
            values.put("name", guest.name)
            val presence = if(guest.presence) 1 else 0
            values.put("presence", presence)

            guestDatabase.writableDatabase.insert("GUEST", null, values)
        }catch(e: Exception){
            e.printStackTrace()
            return false
        }

        return true
    }



    fun getAll(): List<Guest>{
        val list = mutableListOf<Guest>()
        try{
           val cursor= guestDatabase.readableDatabase.query("GUEST",
               arrayOf("id", "name", "presence"), null, null,
               null, null, null)

            while (cursor.moveToNext()){
                val presence = if (cursor.getInt(2) == 1) true else false
                val guest = Guest(cursor.getInt(0), cursor.getString(1), presence)
                list.add(guest)
            }
            cursor.close()
        }catch(ex: Exception){
            ex.printStackTrace()
        }
        return list
    }

}