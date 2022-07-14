package com.example.e_commerce.ui.category.beef

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.e_commerce.data.category.beef.Beef
import com.example.e_commerce.data.category.beef.BeefItems
import com.example.e_commerce.repository.SavedBeefRepository
import com.example.e_commerce.viewModels.BaseViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

class BeefViewModel @Inject constructor(private val repository: SavedBeefRepository): BaseViewModel() {

    private val _beefValues : MutableLiveData<ArrayList<Beef>> = MutableLiveData()

    val beefValues :MutableLiveData<ArrayList<Beef>> = _beefValues

    val valueBeef = BeefItems()

    init {
        viewModelScope.launch {
            _beefValues.postValue(valueBeef.defineDatas())
        }
    }
}