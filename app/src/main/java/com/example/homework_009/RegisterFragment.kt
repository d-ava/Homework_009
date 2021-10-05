package com.example.homework_009

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.homework_009.databinding.RegisterScreenBinding

class RegisterFragment: Fragment() {

private lateinit var binding: RegisterScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = RegisterScreenBinding.inflate(inflater, container, false)
        return binding.root
    }
}