package com.example.e_commerce.adapter.Category

import android.graphics.Paint
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

        binding.bozoo.setPaintFlags(binding.bozoo.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)


    }
    override fun getItemCount() = dataSet.size
}
