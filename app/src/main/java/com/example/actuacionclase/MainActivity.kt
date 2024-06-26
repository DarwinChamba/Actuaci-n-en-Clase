package com.example.actuacionclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.actuacionclase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var id=0
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton1.setOnClickListener {Toast.makeText(this,"Validado",Toast.LENGTH_SHORT).show()
        }
    }
}