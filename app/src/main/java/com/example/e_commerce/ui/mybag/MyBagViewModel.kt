package com.example.e_commerce.ui.mybag

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.e_commerce.data.category.beef.Beef
import com.example.e_commerce.data.category.beef.BeefItems
import com.example.e_commerce.repository.SavedBeefRepository
import com.example.e_commerce.viewModels.BaseViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

class MyBagViewModel : BaseViewModel() {



     fun saveBeef(beef: Beef) = viewModelScope.launch{

    }

}