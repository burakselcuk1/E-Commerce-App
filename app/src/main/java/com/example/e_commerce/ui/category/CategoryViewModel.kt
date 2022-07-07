package com.example.e_commerce.ui.category

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.e_commerce.data.category.beef.Beef
import com.example.e_commerce.data.category.beef.BeefItems
import com.example.e_commerce.data.category.fish.Fish
import com.example.e_commerce.data.category.fish.FishItem
import com.example.e_commerce.data.category.mutton.Mutton
import com.example.e_commerce.data.category.mutton.MuttonItems
import com.example.e_commerce.data.category.vegetable.Vegetable
import com.example.e_commerce.data.category.vegetable.VegetableItems
import com.example.e_commerce.viewModels.BaseViewModel
import kotlinx.coroutines.launch

class CategoryViewModel: BaseViewModel() {

    private val _beefValues : MutableLiveData<ArrayList<Beef>> = MutableLiveData()
    private val _muttonValues : MutableLiveData<ArrayList<Mutton>> = MutableLiveData()
    private val _fishValues : MutableLiveData<ArrayList<Fish>> = MutableLiveData()
    private val _vegetableValues : MutableLiveData<ArrayList<Vegetable>> = MutableLiveData()

    val beefValues :MutableLiveData<ArrayList<Beef>> = _beefValues
    val muttonValues :MutableLiveData<ArrayList<Mutton>> = _muttonValues
    val fishValues :MutableLiveData<ArrayList<Fish>> = _fishValues
    val vegetableValues :MutableLiveData<ArrayList<Vegetable>> = _vegetableValues

    val valueBeef = BeefItems()
    val valueMutton = MuttonItems()
    val valueFish = FishItem()
    val valueVegetable = VegetableItems()

    init {
        viewModelScope.launch {
            _beefValues.postValue(valueBeef.defineDatas())
            _muttonValues.postValue(valueMutton.defineDatas())
            _fishValues.postValue(valueFish.defineDatas())
            _vegetableValues.postValue(valueVegetable.defineDatas())
        }
    }
}