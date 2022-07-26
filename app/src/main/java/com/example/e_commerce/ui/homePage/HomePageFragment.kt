package com.example.e_commerce.ui.homePage

import android.graphics.Paint
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
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
import com.google.android.material.navigation.NavigationView


class HomePageFragment : BaseFragment<FragmentHomePageBinding, HomePageViewModel>(
    layoutId = R.layout.fragment_home_page,
    viewModelClass = HomePageViewModel::class.java
) {

    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var bestDealsAdapter: BestDealsAdapter
    lateinit var toogle: ActionBarDrawerToggle


    override fun onInitDataBinding() {

        val imageList = ArrayList<SlideModel>() // Create image list

        imageList.add(SlideModel(R.drawable.par, "Etlerimiz helal kesimdir. Bizzat ben kestim.", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.par, "The animal population decreased by 58 percent in 42 years.", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.par, "The animal population decreased by 58 percent in 42 years.", ScaleTypes.CENTER_CROP))

        binding.include.imageSlider.setImageList(imageList)
        defineFirstRecyclerView()
        defineSecondRecyclerView()
        clickNotification()
        clickSeeAllFirst()
        openDrawerMenu()


        val drawerLayout : DrawerLayout = binding.drawerLayout
        val navView : NavigationView = binding.navView

        toogle = ActionBarDrawerToggle(requireActivity(),drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toogle)
        toogle.syncState()
        navView.setItemIconTintList(null)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.pageFive -> Toast.makeText(requireContext(),"Clicked Terms and Condition", Toast.LENGTH_SHORT).show()
                R.id.pageFour -> Toast.makeText(requireContext(),"Clicked FAQ", Toast.LENGTH_SHORT).show()
                R.id.pageThree -> Toast.makeText(requireContext(),"Clicked Contact Us", Toast.LENGTH_SHORT).show()
                R.id.pageTwo -> Toast.makeText(requireContext(),"Clicked Maps", Toast.LENGTH_SHORT).show()
                R.id.pageOne -> Toast.makeText(requireContext(),"Clicked Profile", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    private fun openDrawerMenu() {
        binding.include2.drawerMenuIcon.setOnClickListener {
            openCloseNavigationDrawer(it)
        }
    }

    fun openCloseNavigationDrawer(view: View) {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }
    }

    private fun clickSeeAllFirst() {
        binding.seeAllFirst.setOnClickListener {
            findNavController().navigate(R.id.action_homePageFragment_to_categoryragment)
        }
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