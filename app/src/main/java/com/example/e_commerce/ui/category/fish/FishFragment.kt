package com.example.e_commerce.ui.category.fish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.example.e_commerce.R
import com.example.e_commerce.adapter.Category.FishAdapter
import com.example.e_commerce.adapter.Category.MuttonAdapter
import com.example.e_commerce.databinding.FragmentFishBinding
import com.example.e_commerce.ui.base.BaseFragment
import com.example.e_commerce.ui.category.CategoryViewModel


class FishFragment : BaseFragment<FragmentFishBinding,CategoryViewModel>(
    R.layout.fragment_fish,
    viewModelClass = CategoryViewModel::class.java
) {
    private lateinit var categoryFishAdapter: FishAdapter

    override fun onInitDataBinding() {
        viewModel.fishValues.observe(viewLifecycleOwner, Observer {
            categoryFishAdapter = FishAdapter(it)
            binding.fishRecyclerView.layoutManager = GridLayoutManager(requireContext(),2)
            binding.fishRecyclerView.adapter = categoryFishAdapter
        })
    }
}