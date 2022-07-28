package com.example.e_commerce.ui.login.signup

import android.content.Intent
import android.os.Handler
import android.widget.ArrayAdapter
import android.widget.ProgressBar
import androidx.cardview.widget.CardView
import com.example.e_commerce.MainActivity
import com.example.e_commerce.R
import com.example.e_commerce.databinding.FragmentSignupBinding
import com.example.e_commerce.ui.base.BaseFragment
import com.example.e_commerce.util.ProgressButton


class SignupFragment : BaseFragment<FragmentSignupBinding, SignUpViewModel>(
    layoutId = R.layout.fragment_signup,
    viewModelClass = SignUpViewModel::class.java
) {
    override fun onInitDataBinding() {
        val cardView = view?.findViewById<CardView>(R.id.cardView)

        val progressButton = view?.findViewById<ProgressBar>(R.id.progressBar)

        if (progressButton != null) {
            progressButton.getIndeterminateDrawable().setColorFilter(
                getResources().getColor(R.color.white),
                android.graphics.PorterDuff.Mode.SRC_IN)
        }

        with(binding){
            myProgressButton.setOnClickListener {

                val progressButton = view?.let { it1 -> context?.let { it2 -> ProgressButton(it2, it1) } }

                progressButton?.ActiveButton()

                Handler().postDelayed({
                    progressButton?.finishButton()
                    Handler().postDelayed({
                        val intent = Intent(this@SignupFragment.requireContext(), MainActivity::class.java)
                        startActivity(intent)
                    },1000)
                },3000)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        val genders = resources.getStringArray(R.array.gender)

        val arrayAdapter = ArrayAdapter(requireContext(),R.layout.drop_down_item,R.id.textView, genders)
        binding.signupComponent.autoCompleteTextView.setAdapter(arrayAdapter)

    }
}