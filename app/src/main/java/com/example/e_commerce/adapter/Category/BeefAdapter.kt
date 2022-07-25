package com.example.e_commerce.adapter.Category

import android.graphics.Paint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.e_commerce.R
import com.example.e_commerce.data.category.beef.Beef
import com.example.e_commerce.databinding.CategoryBeefRowItemBinding
import com.example.e_commerce.ui.mybag.MyBagViewModel


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
  /*      viewModel = ViewModelProviders.of(FragmentActivity())
            .get(MyBagViewModel::class.java)*/


        binding.bozoo.setPaintFlags(binding.bozoo.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)

        binding.floatButton.setOnClickListener {
            val bundle = Bundle()
            bundle.putSerializable("beefId",dataSet.get(position))

            val navigationController = Navigation.findNavController(viewHolder.itemView)
            navigationController.navigate(R.id.action_categoryragment_to_myBagFragment, bundle)
            Toast.makeText(it.context, "Added '${dataSet.get(position).isim}' to your bag", Toast.LENGTH_SHORT).show();
        }
    }
    override fun getItemCount() = dataSet.size

}
