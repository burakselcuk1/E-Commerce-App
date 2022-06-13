package com.example.e_commerce.ui.login.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.e_commerce.R
import com.example.e_commerce.databinding.FragmentSignupBinding
import com.example.e_commerce.ui.base.BaseFragment


class SignupFragment : BaseFragment<FragmentSignupBinding, SignUpViewModel>(
    layoutId = R.layout.fragment_signup,
    viewModelClass = SignUpViewModel::class.java
) {
    override fun onInitDataBinding() {

    }


}