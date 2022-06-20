package com.example.e_commerce.ui.homePage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import androidx.recyclerview.widget.LinearLayoutManager

import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.e_commerce.R
import com.example.e_commerce.adapter.CategoryAdapter
import com.example.e_commerce.data.Category
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

        val a = Category("sadf","https://www.incimages.com/uploaded_files/image/1920x1080/getty_80116649_344560.jpg")
        val b = Category("sdaf","https://www.provisioneronline.com/ext/resources/images/Responsive-Default-Images/meat-science-review.jpg?1607975249")
        val cc = Category("sdaf","https://www.provisioneronline.com/ext/resources/images/Responsive-Default-Images/meat-science-review.jpg?1607975249")
        val d = Category("sdaf","https://www.provisioneronline.com/ext/resources/images/Responsive-Default-Images/meat-science-review.jpg?1607975249")

        val c = arrayListOf<Category>(a,b,cc,d)

        categoryAdapter = CategoryAdapter(c)

        binding.categoryRecyclerView.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)

        binding.categoryRecyclerView.adapter = categoryAdapter

    }
}