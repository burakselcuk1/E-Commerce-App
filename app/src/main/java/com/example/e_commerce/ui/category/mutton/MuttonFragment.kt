package com.example.e_commerce.ui.category.mutton

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.e_commerce.R
import com.example.e_commerce.databinding.FragmentMuttonBinding
import com.example.e_commerce.ui.base.BaseFragment
import com.example.e_commerce.ui.category.CategoryViewModel


class MuttonFragment : BaseFragment<FragmentMuttonBinding,CategoryViewModel>(
    R.layout.fragment_mutton,
    viewModelClass = CategoryViewModel::class.java
) {
    override fun onInitDataBinding() {

    }


}