package com.example.homework_009

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homework_009.databinding.RegisterScreenBinding

class RegisterFragment : Fragment() {

    private lateinit var binding: RegisterScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = RegisterScreenBinding.inflate(inflater, container, false)
        setListeners()

        return binding.root
    }

    private fun setListeners() {

        binding.BackArrow.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}