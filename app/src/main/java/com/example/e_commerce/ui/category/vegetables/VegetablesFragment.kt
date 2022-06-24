package com.example.e_commerce.ui.category.vegetables

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.e_commerce.R
import com.example.e_commerce.databinding.FragmentVegetablesBinding
import com.example.e_commerce.ui.base.BaseFragment
import com.example.e_commerce.ui.category.CategoryViewModel

class VegetablesFragment :BaseFragment<FragmentVegetablesBinding,CategoryViewModel>(
    R.layout.fragment_vegetables,
    viewModelClass = CategoryViewModel::class.java
) {

    override fun onInitDataBinding() {

    }

}