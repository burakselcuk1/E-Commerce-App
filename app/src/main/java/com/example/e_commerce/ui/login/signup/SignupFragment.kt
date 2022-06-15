package com.example.e_commerce.ui.login.signup

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.e_commerce.MainActivity
import com.example.e_commerce.R
import com.example.e_commerce.databinding.FragmentSignupBinding
import com.example.e_commerce.ui.base.BaseFragment
import com.example.e_commerce.ui.login.LoginActivity


class SignupFragment : BaseFragment<FragmentSignupBinding, SignUpViewModel>(
    layoutId = R.layout.fragment_signup,
    viewModelClass = SignUpViewModel::class.java
) {
    override fun onInitDataBinding() {
        with(binding){
            appCompatButton.setOnClickListener {
                val intent = Intent(this@SignupFragment.requireContext(), MainActivity::class.java)
                startActivity(intent)
            }
        }



    }
}