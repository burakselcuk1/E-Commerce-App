package com.example.e_commerce.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.e_commerce.R
import com.example.e_commerce.data.category.beef.Beef


class RoomAdapter(val dataSet: ArrayList<Beef>) : RecyclerView.Adapter<RoomAdapter.ViewHolder>() {

    private lateinit var mListener : onItemClickListener


    interface onItemClickListener {
        fun OnItemClick(position: Beef)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        mListener = listener
    }



    class ViewHolder(view: View, listener: onItemClickListener) :
        RecyclerView.ViewHolder(view) {
        val isim: TextView
        val oldPrice: TextView


        init {
            // Define click listener for the ViewHolder's View.
            isim = view.findViewById(R.id.bozo)
            oldPrice = view.findViewById(R.id.bozoo)

        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.room_item, viewGroup, false)
        return ViewHolder(view, mListener)

    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.isim.text = dataSet[position].isim
        viewHolder.oldPrice.text = dataSet[position].oldPrice

        val url =  dataSet[position]
        viewHolder.itemView.setOnClickListener {
            mListener.OnItemClick(url)
        }

    }

    private fun deleteAndUpdate(newBeefList: List<Beef>) {


    }

    override fun getItemCount() = dataSet.size


}
