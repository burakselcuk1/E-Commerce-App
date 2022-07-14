package com.example.e_commerce.db

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.Dao
import com.example.e_commerce.data.category.beef.Beef

@Dao
interface Dao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovie(beef: Beef)

    @Delete
    suspend fun deleteTodo(beef: Beef)


    @Query("SELECT * FROM beef_data ORDER BY id ASC")
    fun getAllToDoes(): LiveData<List<Beef>>
}