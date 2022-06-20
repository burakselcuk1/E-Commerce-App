package com.example.e_commerce.ui.homePage

import android.view.ViewGroup
import android.widget.HorizontalScrollView
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager

import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.e_commerce.R
import com.example.e_commerce.adapter.CategoryAdapter
import com.example.e_commerce.data.Category
import com.example.e_commerce.data.CategoryItems
import com.example.e_commerce.databinding.FragmentHomePageBinding
import com.example.e_commerce.ui.base.BaseFragment


class HomePageFragment : BaseFragment<FragmentHomePageBinding, HomePageViewModel>(
    layoutId = R.layout.fragment_home_page,
    viewModelClass = HomePageViewModel::class.java
) {

    private lateinit var categoryAdapter: CategoryAdapter

    override fun onInitDataBinding() {

        val imageList = ArrayList<SlideModel>() // Create image list

        imageList.add(SlideModel(R.drawable.par, "The animal population decreased by 58 percent in 42 years.", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.par, "The animal population decreased by 58 percent in 42 years.", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.par, "The animal population decreased by 58 percent in 42 years.", ScaleTypes.CENTER_CROP))

        binding.include.imageSlider.setImageList(imageList)
        defineFirstRecyclerView()
    }

    private fun defineFirstRecyclerView() {
        viewModel.cateforyValues.observe(viewLifecycleOwner, Observer {
            categoryAdapter = CategoryAdapter(it)
            binding.categoryRecyclerView.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
            binding.categoryRecyclerView.adapter = categoryAdapter
        })
    }
}