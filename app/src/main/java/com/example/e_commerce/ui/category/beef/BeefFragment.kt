package com.example.e_commerce.ui.category.beef

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.e_commerce.R
import com.example.e_commerce.databinding.FragmentBeefBinding
import com.example.e_commerce.ui.base.BaseFragment
import com.example.e_commerce.ui.category.CategoryViewModel


class BeefFragment : BaseFragment<FragmentBeefBinding,CategoryViewModel>(
    R.layout.fragment_beef,
    viewModelClass = CategoryViewModel::class.java
) {

    override fun onInitDataBinding() {
        TODO("Not yet implemented")
    }
}