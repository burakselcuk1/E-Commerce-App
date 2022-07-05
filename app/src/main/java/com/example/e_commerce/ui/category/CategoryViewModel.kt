package com.example.e_commerce.ui.category

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.e_commerce.data.Category
import com.example.e_commerce.data.category.Beef
import com.example.e_commerce.data.category.BeefItems
import com.example.e_commerce.data.category.Mutton
import com.example.e_commerce.data.category.MuttonItems
import com.example.e_commerce.viewModels.BaseViewModel
import kotlinx.coroutines.launch

class CategoryViewModel: BaseViewModel() {

    private val _beefValues : MutableLiveData<ArrayList<Beef>> = MutableLiveData()
    private val _muttonValues : MutableLiveData<ArrayList<Mutton>> = MutableLiveData()

    val beefValues :MutableLiveData<ArrayList<Beef>> = _beefValues
    val muttonValues :MutableLiveData<ArrayList<Mutton>> = _muttonValues

    val valueBeef = BeefItems()
    val valueMutton = MuttonItems()

    init {
        viewModelScope.launch {
            _beefValues.postValue(valueBeef.defineDatas())
            _muttonValues.postValue(valueMutton.defineDatas())
        }
    }
}