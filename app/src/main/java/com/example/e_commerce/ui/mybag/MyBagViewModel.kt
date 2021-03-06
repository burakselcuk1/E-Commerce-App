package com.example.e_commerce.ui.mybag

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.e_commerce.data.category.beef.Beef
import com.example.e_commerce.data.category.beef.BeefItems
import com.example.e_commerce.repository.SavedBeefRepository
import com.example.e_commerce.viewModels.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyBagViewModel @Inject constructor(private val repository: SavedBeefRepository): BaseViewModel() {


     fun saveBeef(beef: Beef) = viewModelScope.launch{
        repository.insertBeef(beef)
    }

    val readAllData: LiveData<List<Beef>> = repository.readAllData

    fun deleteBeef(beef: Beef) = viewModelScope.launch {
        repository.deleteBeef(beef)
    }


}