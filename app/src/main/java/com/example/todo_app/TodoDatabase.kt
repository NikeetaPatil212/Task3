package com.example.todo_app

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Entity1::class],version = 1)
abstract class TodoDatabase : RoomDatabase() {
    abstract fun todoDao() : ToDoDAO
}