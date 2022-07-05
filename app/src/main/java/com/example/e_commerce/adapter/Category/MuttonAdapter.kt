package com.example.e_commerce.adapter.Category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.e_commerce.data.category.mutton.Mutton
import com.example.e_commerce.databinding.CategoryMuttonRowItemBinding

class MuttonAdapter(val dataSet: ArrayList<Mutton>) :
    RecyclerView.Adapter<MuttonAdapter.ViewHolder>() {
    private lateinit var binding: CategoryMuttonRowItemBinding

    class ViewHolder(var view: CategoryMuttonRowItemBinding) : RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        binding = CategoryMuttonRowItemBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.view.categoryMutton = dataSet[position]



    }
    override fun getItemCount() = dataSet.size
}
