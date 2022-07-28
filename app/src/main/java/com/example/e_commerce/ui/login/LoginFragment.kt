package com.example.e_commerce.ui.login

import android.content.Intent
import android.os.Handler
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.findNavController
import com.example.e_commerce.MainActivity
import com.example.e_commerce.R
import com.example.e_commerce.databinding.FragmentLoginBinding
import com.example.e_commerce.ui.base.BaseFragment
import com.example.e_commerce.util.ProgressButton


class LoginFragment : BaseFragment<FragmentLoginBinding,LoginViewModel>(
    layoutId = R.layout.fragment_login,
    viewModelClass = LoginViewModel::class.java
) {
    override fun onInitDataBinding() {
        val cardView = view?.findViewById<CardView>(R.id.cardView)
        var text = view?.findViewById<TextView>(R.id.textView1)
        if (text != null) {
            text.text ="Login"
            if (cardView != null) {
                text.setTextColor(cardView.resources.getColor(android.R.color.black))
            }
        }

        if (cardView != null) {
            view?.findViewById<ConstraintLayout>(R.id.constraintLayout1)
                ?.setBackgroundColor(cardView.resources.getColor(android.R.color.white))
        }

        binding.appCompatButton.setOnClickListener {

            val progressButton = view?.let { it1 -> context?.let { it2 -> ProgressButton(it2, it1) } }

            progressButton?.ActiveButton()

            Handler().postDelayed({
                progressButton?.finishButton()
                Handler().postDelayed({
                    val intent = Intent(this@LoginFragment.requireContext(), MainActivity::class.java)
                    startActivity(intent)
                },1000)
            },3000)
        }

        binding.textView2.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signupFragment)
        }
    }
}