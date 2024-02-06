package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //initialize the UI
        initUI()

    }

    private fun initUI() {

        binding.backButton.setOnClickListener {

        }

        binding.btnSignIn.setOnClickListener {

        }

        binding.forgotPassword.setOnClickListener {

        }

        binding.signUp.setOnClickListener {

        }

    }
}