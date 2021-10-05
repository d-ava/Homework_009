package com.example.homework_009

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_009.databinding.ActivityMainBinding
import com.example.homework_009.databinding.HomeScreenBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}