package com.example.e_commerce.ui.mybag

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.e_commerce.R
import com.example.e_commerce.adapter.Category.BeefAdapter
import com.example.e_commerce.data.category.beef.Beef
import com.example.e_commerce.data.category.beef.BeefItems
import com.example.e_commerce.databinding.FragmentMyBagBinding
import com.example.e_commerce.ui.base.BaseFragment

class MyBagFragment : BaseFragment<FragmentMyBagBinding, MyBagViewModel>(
    R.layout.fragment_my_bag,
    viewModelClass = MyBagViewModel::class.java
) {
    private lateinit var categoryBeefAdapter: BeefAdapter
    lateinit var resultBeef: Beef


    override fun onInitDataBinding() {

        val args = this.arguments
        val beefId: String? = args?.getSerializable("beefId") as String?

        if (beefId != null) {
            Log.e("burak", beefId)
        }

        val a:BeefItems


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