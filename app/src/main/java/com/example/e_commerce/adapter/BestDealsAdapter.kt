package com.example.e_commerce.adapter

import android.graphics.Color
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.e_commerce.R
import com.example.e_commerce.databinding.BestDealRecyclerviewRowItemBinding
import dagger.hilt.android.internal.Contexts.getApplication
import kotlin.coroutines.coroutineContext

class BestDealsAdapter(val dataSet: ArrayList<com.example.e_commerce.data.BestDeals>) :
    RecyclerView.Adapter<BestDealsAdapter.ViewHolder>() {
    private lateinit var binding: BestDealRecyclerviewRowItemBinding


    class ViewHolder(var view: BestDealRecyclerviewRowItemBinding) : RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        binding = BestDealRecyclerviewRowItemBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.view.bestDeals = dataSet[position]

        binding.bozoo.setPaintFlags(binding.bozoo.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
        binding.floatButton.setOnClickListener {
            Toast.makeText(it!!.context, "Added in basket", Toast.LENGTH_SHORT).show()

        }

    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size


}