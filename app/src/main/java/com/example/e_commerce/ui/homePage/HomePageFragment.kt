package com.example.e_commerce.ui.homePage

import android.graphics.Paint
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.e_commerce.R
import com.example.e_commerce.adapter.BestDealsAdapter
import com.example.e_commerce.adapter.CategoryAdapter
import com.example.e_commerce.databinding.FragmentHomePageBinding
import com.example.e_commerce.ui.base.BaseFragment


class HomePageFragment : BaseFragment<FragmentHomePageBinding, HomePageViewModel>(
    layoutId = R.layout.fragment_home_page,
    viewModelClass = HomePageViewModel::class.java
) {

    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var bestDealsAdapter: BestDealsAdapter

    override fun onInitDataBinding() {

        val imageList = ArrayList<SlideModel>() // Create image list

        imageList.add(SlideModel(R.drawable.par, "Etlerimiz helal kesimdir. Bizzat ben kestim.", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.par, "The animal population decreased by 58 percent in 42 years.", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.par, "The animal population decreased by 58 percent in 42 years.", ScaleTypes.CENTER_CROP))

        binding.include.imageSlider.setImageList(imageList)
        defineFirstRecyclerView()
        defineSecondRecyclerView()
        clickNotification()

    }

    private fun clickNotification() {
        binding.include2.imageView22.setOnClickListener {
            findNavController().navigate(R.id.action_homePageFragment_to_notificationFragment)
        }
    }

    private fun defineSecondRecyclerView() {
        viewModel.bestDealValues.observe(viewLifecycleOwner, Observer {
            bestDealsAdapter = BestDealsAdapter(it)
            binding.bestDealRecyclerView.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
            binding.bestDealRecyclerView.adapter = bestDealsAdapter
        })
    }

    private fun defineFirstRecyclerView() {
        viewModel.cateforyValues.observe(viewLifecycleOwner, Observer {
            categoryAdapter = CategoryAdapter(it)
            binding.categoryRecyclerView.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
            binding.categoryRecyclerView.adapter = categoryAdapter
        })
    }
}