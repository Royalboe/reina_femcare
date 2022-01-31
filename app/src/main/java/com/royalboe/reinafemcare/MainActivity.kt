package com.royalboe.reinafemcare

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.royalboe.reinafemcare.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        binding.apply {
//            businessPageLayout.setBackgroundColor(Color.rgb(120, 81, 169))
//            businessPageLayout.setBackgroundResource(R.drawable.purple)
//        }
    }
}