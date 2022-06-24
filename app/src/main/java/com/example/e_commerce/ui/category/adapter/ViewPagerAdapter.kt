package com.example.e_commerce.ui.category.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.e_commerce.ui.category.beef.BeefFragment
import com.example.e_commerce.ui.category.fish.FishFragment
import com.example.e_commerce.ui.category.mutton.MuttonFragment
import com.example.e_commerce.ui.category.vegetables.VegetablesFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{
                BeefFragment()
            }
            1->{
                MuttonFragment()
            }
            2->{
                FishFragment()
            }
            3->{
                VegetablesFragment()
            }
            else->{
                Fragment()
            }
        }
    }
}