package com.example.todo_app

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ToDo" )
data class Entity1(
    @PrimaryKey( autoGenerate = true)
    var id:Int,
    @ColumnInfo(name ="title")
    var title: String,
    @ColumnInfo(name = "date")
    var date: String
)