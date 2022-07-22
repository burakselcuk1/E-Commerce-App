package com.example.e_commerce.adapter

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.example.e_commerce.data.category.beef.Beef
import com.example.e_commerce.databinding.RoomItemBinding
import com.example.e_commerce.ui.mybag.MyBagViewModel


class RoomAdapter(val dataSet: ArrayList<Beef>) :
    RecyclerView.Adapter<RoomAdapter.ViewHolder>() {

    private lateinit var binding: RoomItemBinding
    private lateinit var viewModel: MyBagViewModel

    class ViewHolder(var view: RoomItemBinding) :
        RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        binding = RoomItemBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.view.categoryBeef = dataSet[position]

        binding.bozoo.setPaintFlags(binding.bozoo.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)

        binding.floatButton.setOnClickListener {
            val id = dataSet.get(position)

           // viewModel = ViewModelProviders.of((it as Fragment?)!!).get(MyBagViewModel::class.java)
           // viewModel.deleteBeef(id)

          Toast.makeText(it.context, id.isim, Toast.LENGTH_SHORT).show()

        }
    }

    private fun deleteAndUpdate(newBeefList: List<Beef>) {


    }

    override fun getItemCount() = dataSet.size
}
