package com.example.e_commerce.ui.category.beef

import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.example.e_commerce.R
import com.example.e_commerce.adapter.Category.BeefAdapter
import com.example.e_commerce.databinding.FragmentBeefBinding
import com.example.e_commerce.ui.base.BaseFragment
import com.example.e_commerce.ui.category.CategoryViewModel


class BeefFragment : BaseFragment<FragmentBeefBinding, CategoryViewModel>(
    R.layout.fragment_beef,
    viewModelClass = CategoryViewModel::class.java
) {
    private lateinit var categoryBeefAdapter: BeefAdapter

    override fun onInitDataBinding() {

        defineRecyclerViewAdapter()
    }

    private fun defineRecyclerViewAdapter() {
        viewModel.beefValues.observe(viewLifecycleOwner, Observer {
            categoryBeefAdapter = BeefAdapter(it)
            binding.beefRecyclerView.layoutManager = GridLayoutManager(requireContext(),2)
            binding.beefRecyclerView.adapter = categoryBeefAdapter
        })
    }
}