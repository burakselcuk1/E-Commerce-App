package com.example.e_commerce.adapter.Category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.e_commerce.R
import com.example.e_commerce.data.category.Beef
import com.example.e_commerce.databinding.CategoryBeefRowItemBinding

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

        viewHolder.itemView.setOnClickListener {
            val navigationController = Navigation.findNavController(viewHolder.itemView)
            navigationController.navigate(R.id.action_homePageFragment_to_categoryragment)
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}