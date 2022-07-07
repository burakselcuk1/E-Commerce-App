package com.example.e_commerce.ui.category.vegetables

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.example.e_commerce.R
import com.example.e_commerce.adapter.Category.MuttonAdapter
import com.example.e_commerce.adapter.Category.VegetablesAdapter
import com.example.e_commerce.databinding.FragmentVegetablesBinding
import com.example.e_commerce.ui.base.BaseFragment
import com.example.e_commerce.ui.category.CategoryViewModel

class VegetablesFragment :BaseFragment<FragmentVegetablesBinding,CategoryViewModel>(
    R.layout.fragment_vegetables,
    viewModelClass = CategoryViewModel::class.java
) {
    private lateinit var categoryVegetablesAdapter: VegetablesAdapter

    override fun onInitDataBinding() {
        viewModel.vegetableValues.observe(viewLifecycleOwner, Observer {
            categoryVegetablesAdapter = VegetablesAdapter(it)
            binding.recyclerViewVegetables.layoutManager = GridLayoutManager(requireContext(),2)
            binding.recyclerViewVegetables.adapter = categoryVegetablesAdapter
        })
    }
}