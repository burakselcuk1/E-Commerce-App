package com.example.e_commerce.adapter.Category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.e_commerce.data.category.vegetable.Vegetable
import com.example.e_commerce.databinding.CategoryVegetablesRowItemBinding

class VegetablesAdapter(val dataSet: ArrayList<Vegetable>) :
    RecyclerView.Adapter<VegetablesAdapter.ViewHolder>() {
    private lateinit var binding: CategoryVegetablesRowItemBinding

    class ViewHolder(var view: CategoryVegetablesRowItemBinding) : RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        binding = CategoryVegetablesRowItemBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.view.categoryVegetables = dataSet[position]
    }
    override fun getItemCount() = dataSet.size
}
