package com.example.e_commerce.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.e_commerce.data.category.beef.Beef

@Database(entities = [Beef::class], version = 1, exportSchema = false)
abstract class Database : RoomDatabase() {

    abstract fun toDoDao():Dao

}