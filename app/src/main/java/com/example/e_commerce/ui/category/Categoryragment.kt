package com.example.e_commerce.ui.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.e_commerce.R
import com.example.e_commerce.databinding.FragmentCategoryragmentBinding
import com.example.e_commerce.ui.base.BaseFragment
import com.example.e_commerce.ui.category.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator


class Categoryragment :BaseFragment<FragmentCategoryragmentBinding,CategoryViewModel>(
    R.layout.fragment_categoryragment,
    viewModelClass = CategoryViewModel::class.java
) {
    override fun onInitDataBinding() {
        val adapter = fragmentManager?.let { ViewPagerAdapter(it,lifecycle) }
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout,binding.viewPager){tab,position->
            when(position){
                0->{
                    tab.text ="Beef"
                }
                1->{
                    tab.text="Mutton"
                }
                2->{
                    tab.text="Fish"
                }
                3->{
                    tab.text="Vegetab"
                }
            }
        }.attach()
    }
}