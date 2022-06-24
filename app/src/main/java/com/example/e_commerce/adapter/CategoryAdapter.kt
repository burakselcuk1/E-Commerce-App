package com.example.e_commerce.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.e_commerce.R
import com.example.e_commerce.data.Category
import com.example.e_commerce.databinding.CategoryItemBinding

class CategoryAdapter(val dataSet: ArrayList<Category>) :
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
    private lateinit var binding: CategoryItemBinding

    class ViewHolder(var view: CategoryItemBinding) : RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        binding = CategoryItemBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.view.category = dataSet[position]

        viewHolder.itemView.setOnClickListener {
                val navigationController = Navigation.findNavController(viewHolder.itemView)
                navigationController.navigate(R.id.action_homePageFragment_to_categoryragment)
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}