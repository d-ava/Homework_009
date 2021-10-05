package com.example.homework_009

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.homework_009.databinding.LoginScreenBinding

class LoginFragment: Fragment() {
lateinit var binding: LoginScreenBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = LoginScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

}