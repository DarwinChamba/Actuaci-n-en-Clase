package com.example.actuacionclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.actuacionclase.databinding.ActivityMain2Binding

class SeleccionarVideo : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}