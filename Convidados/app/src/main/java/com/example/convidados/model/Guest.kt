package com.example.convidados.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Guest")
class Guest {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    val id = 0

    @ColumnInfo
    val name = ""

    @ColumnInfo
    val presence = true

}