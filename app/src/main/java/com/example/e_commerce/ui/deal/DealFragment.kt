package com.example.e_commerce.ui.deal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.e_commerce.R
import com.example.e_commerce.databinding.FragmentDealBinding
import com.example.e_commerce.ui.base.BaseFragment


class DealFragment : BaseFragment<FragmentDealBinding, DealViewModel>(
    layoutId = R.layout.fragment_deal,
    viewModelClass = DealViewModel::class.java
) {



    override fun onInitDataBinding() {
    }
}