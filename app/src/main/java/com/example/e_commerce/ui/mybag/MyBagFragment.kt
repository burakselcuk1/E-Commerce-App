package com.example.e_commerce.ui.mybag

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.e_commerce.R
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
            itemClicked()

        })
    }

    private fun itemClicked() {
        categoryBeefAdapter.setOnItemClickListener(object : RoomAdapter.onItemClickListener{
            override fun OnItemClick(position: Beef) {

                val builder = AlertDialog.Builder(requireContext())
                builder.setPositiveButton("Yes"){_, _ ->
                    Toast.makeText(requireContext(),"Deleted ${position.isim}",Toast.LENGTH_SHORT).show()
                    viewModel.deleteBeef(position)
                    categoryBeefAdapter.notifyDataSetChanged()

                }
                builder.setNegativeButton("No"){_, _ ->}
                builder.setTitle("Delete - ${position.isim}")
                builder.setMessage("Are you sure delete this product ' ${position.isim} ' ?")
                builder.create().show()

            }
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