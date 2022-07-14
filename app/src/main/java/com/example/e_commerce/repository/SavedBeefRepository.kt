package com.example.e_commerce.repository

import androidx.lifecycle.LiveData
import com.example.e_commerce.data.category.beef.Beef
import com.example.e_commerce.db.Dao
import javax.inject.Inject

class SavedBeefRepository @Inject constructor(private val dao: Dao) {

    suspend fun insertBeef(beef: Beef) = dao.insertMovie(beef)
    suspend fun deleteBeef(beef: Beef) = dao.deleteTodo(beef)
    val readAllData: LiveData<List<Beef>> = dao.getAllToDoes()

}