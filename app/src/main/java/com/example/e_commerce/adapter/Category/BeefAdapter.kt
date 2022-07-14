package com.example.e_commerce.adapter.Category

import android.graphics.Paint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.IdRes
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.e_commerce.R
import com.example.e_commerce.data.category.beef.Beef
import com.example.e_commerce.databinding.CategoryBeefRowItemBinding
import com.example.e_commerce.ui.category.beef.BeefFragmentDirections

class BeefAdapter(val dataSet: ArrayList<Beef>) :
    RecyclerView.Adapter<BeefAdapter.ViewHolder>() {
    private lateinit var binding: CategoryBeefRowItemBinding

    class ViewHolder(var view: CategoryBeefRowItemBinding) : RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        binding = CategoryBeefRowItemBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.view.categoryBeef = dataSet[position]

        binding.bozoo.setPaintFlags(binding.bozoo.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)

        viewHolder.itemView.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("beefId",""+dataSet.get(position))

            val navigationController = Navigation.findNavController(viewHolder.itemView)
            navigationController.navigate(R.id.action_categoryragment_to_myBagFragment, bundle)

        }
    }
    override fun getItemCount() = dataSet.size
}
