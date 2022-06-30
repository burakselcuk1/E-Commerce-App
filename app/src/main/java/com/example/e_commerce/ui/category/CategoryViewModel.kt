package com.example.e_commerce.ui.category

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.e_commerce.data.Category
import com.example.e_commerce.data.category.Beef
import com.example.e_commerce.data.category.BeefItems
import com.example.e_commerce.viewModels.BaseViewModel
import kotlinx.coroutines.launch

class CategoryViewModel: BaseViewModel() {



    private val _beefValues : MutableLiveData<ArrayList<Beef>> = MutableLiveData()

    val beefValues :MutableLiveData<ArrayList<Beef>> = _beefValues

    val value = BeefItems()

    init {
        viewModelScope.launch {
            _beefValues.postValue(value.defineDatas())
        }
    }
}