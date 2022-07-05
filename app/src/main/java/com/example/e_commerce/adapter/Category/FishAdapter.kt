package com.example.e_commerce.adapter.Category

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.e_commerce.data.category.beef.Beef
import com.example.e_commerce.data.category.fish.Fish
import com.example.e_commerce.databinding.CategoryFishRowItemBinding

class FishAdapter(val dataSet: ArrayList<Fish>) :
    RecyclerView.Adapter<FishAdapter.ViewHolder>() {
    private lateinit var binding: CategoryFishRowItemBinding

    class ViewHolder(var view: CategoryFishRowItemBinding) : RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        binding = CategoryFishRowItemBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.view.categoryFish = dataSet[position]
    }
    override fun getItemCount() = dataSet.size
}
