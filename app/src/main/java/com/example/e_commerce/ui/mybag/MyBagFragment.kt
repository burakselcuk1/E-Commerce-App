package com.example.e_commerce.ui.mybag

import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.e_commerce.R
import com.example.e_commerce.adapter.Category.BeefAdapter
import com.example.e_commerce.adapter.RoomAdapter
import com.example.e_commerce.data.category.beef.Beef
import com.example.e_commerce.databinding.FragmentMyBagBinding
import com.example.e_commerce.ui.base.BaseFragment
import java.io.Serializable

class MyBagFragment : BaseFragment<FragmentMyBagBinding, MyBagViewModel>(
    R.layout.fragment_my_bag,
    viewModelClass = MyBagViewModel::class.java
) {
    private lateinit var categoryBeefAdapter: RoomAdapter
    lateinit var resultBeef: Beef

    override fun onInitDataBinding() {

        val args = this.arguments
        val beefId: Serializable? = args?.getSerializable("beefId")

        (beefId as? Beef)?.let { viewModel.saveBeef(it) }
       readAllData()

    }

    private fun readAllData() {
        viewModel.readAllData.observe(viewLifecycleOwner, Observer {
            binding.roomRecyclerView.layoutManager = GridLayoutManager(requireContext(),2)
            categoryBeefAdapter = RoomAdapter(it as ArrayList<Beef>)
            binding.roomRecyclerView.adapter = categoryBeefAdapter
        })
    }

    override fun onViewCreated(view: View, savedInstanceState:  Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                findNavController().navigate(R.id.action_myBagFragment_to_categoryragment)
            }

        })
    }
}