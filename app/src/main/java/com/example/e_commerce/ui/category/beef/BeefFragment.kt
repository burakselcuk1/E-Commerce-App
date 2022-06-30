package com.example.e_commerce.ui.category.beef

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.example.e_commerce.R
import com.example.e_commerce.adapter.Category.BeefAdapter
import com.example.e_commerce.adapter.CategoryAdapter
import com.example.e_commerce.databinding.FragmentBeefBinding
import com.example.e_commerce.ui.base.BaseFragment
import com.example.e_commerce.ui.category.CategoryViewModel


class BeefFragment : BaseFragment<FragmentBeefBinding,CategoryViewModel>(
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