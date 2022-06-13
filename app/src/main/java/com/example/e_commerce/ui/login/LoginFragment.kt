package com.example.e_commerce.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.e_commerce.R
import com.example.e_commerce.databinding.FragmentLoginBinding
import com.example.e_commerce.ui.base.BaseFragment


class LoginFragment : BaseFragment<FragmentLoginBinding,LoginViewModel>(
    layoutId = R.layout.fragment_login,
    viewModelClass = LoginViewModel::class.java
) {
    override fun onInitDataBinding() {

    }


}