package com.example.e_commerce.ui.homePage

import androidx.lifecycle.MutableLiveData
import com.example.e_commerce.data.Category
import com.example.e_commerce.data.CategoryItems
import com.example.e_commerce.viewModels.BaseViewModel

class HomePageViewModel: BaseViewModel() {

    val cateforyValues = MutableLiveData<ArrayList<Category>>()
    val c = CategoryItems()
    init {
        cateforyValues.postValue(c.defineDatas())
    }
}