package com.example.e_commerce.ui.category.fish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.e_commerce.R
import com.example.e_commerce.databinding.FragmentFishBinding
import com.example.e_commerce.ui.base.BaseFragment
import com.example.e_commerce.ui.category.CategoryViewModel


class FishFragment : BaseFragment<FragmentFishBinding,CategoryViewModel>(
    R.layout.fragment_fish,
    viewModelClass = CategoryViewModel::class.java
) {
    override fun onInitDataBinding() {

    }


}