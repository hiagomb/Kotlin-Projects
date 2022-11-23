package com.example.convidados.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.convidados.model.Guest


@Database(entities = [Guest::class], version = 1)
abstract class GuestDatabase: RoomDatabase() {

    companion object{
        private lateinit var instance: GuestDatabase

        fun getDatabase(context: Context): GuestDatabase{
            if(!::instance.isInitialized){
                synchronized(GuestDatabase::class){
                    instance = Room.databaseBuilder(context, GuestDatabase::class.java,
                        "GuestDB").build()
                }
            }
            return instance
        }
    }
}