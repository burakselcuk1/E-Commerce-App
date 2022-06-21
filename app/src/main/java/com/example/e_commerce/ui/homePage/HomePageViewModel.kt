package com.example.e_commerce.ui.homePage

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.e_commerce.data.BestDeals
import com.example.e_commerce.data.BestDealsItems
import com.example.e_commerce.data.Category
import com.example.e_commerce.data.CategoryItems
import com.example.e_commerce.viewModels.BaseViewModel
import kotlinx.coroutines.launch

class HomePageViewModel: BaseViewModel() {

    private val _categryValues : MutableLiveData<ArrayList<Category>> = MutableLiveData()
    private val _bestDealValues : MutableLiveData<ArrayList<BestDeals>> = MutableLiveData()

    val cateforyValues : MutableLiveData<ArrayList<Category>> = _categryValues
    val bestDealValues : MutableLiveData<ArrayList<BestDeals>> = _bestDealValues

    val c = CategoryItems()
    val d = BestDealsItems()


    init {
        viewModelScope.launch {
            _categryValues.postValue(c.defineDatas())
            _bestDealValues.postValue(d.defineDatas())
        }
    }
}