package com.example.e_commerce.ui.category.mutton

import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.example.e_commerce.R
import com.example.e_commerce.adapter.Category.MuttonAdapter
import com.example.e_commerce.databinding.FragmentMuttonBinding
import com.example.e_commerce.ui.base.BaseFragment
import com.example.e_commerce.ui.category.CategoryViewModel


class MuttonFragment : BaseFragment<FragmentMuttonBinding,CategoryViewModel>(
    R.layout.fragment_mutton,
    viewModelClass = CategoryViewModel::class.java
) {
    private lateinit var categoryMuttonAdapter: MuttonAdapter

    override fun onInitDataBinding() {
        viewModel.muttonValues.observe(viewLifecycleOwner, Observer {
            categoryMuttonAdapter = MuttonAdapter(it)
            binding.muttonRecyclerView.layoutManager = GridLayoutManager(requireContext(),2)
            binding.muttonRecyclerView.adapter = categoryMuttonAdapter
        })
    }
}