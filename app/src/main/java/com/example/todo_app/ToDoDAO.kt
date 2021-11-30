package com.example.todo_app

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.Update

@Dao
interface ToDoDAO {

    @Insert
    fun insertTask(entity1: Entity1)

    @Query("SELECT * FROM ToDO")
    fun getTasks(): List<Entity1>
}
