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

        binding.boton1.setOnClickListener {recuperarDatos()
        }
    }

    private fun recuperarDatos() {
        val nombre=binding.nombre.text.toString()
        val apellido=binding.apellido.text.toString()
        val nota = binding.nota.text.toString()
        binding.informacion.setText("$nombre,$apellido,$nota")
    }
}