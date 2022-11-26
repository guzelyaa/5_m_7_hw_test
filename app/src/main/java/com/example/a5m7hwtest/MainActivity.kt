package com.example.a5m7hwtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a5m7hwtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        calculate()
    }

    fun calculate() {
        binding.btnPlus.setOnClickListener {
            binding.tvResult.text =
                Math().add(binding.num1.text.toString(), binding.num2.text.toString())
        }
        binding.btnDivide.setOnClickListener {
            binding.tvResult.text =
                Math().divide(binding.num1.text.toString(), binding.num2.text.toString())
        }
    }
}