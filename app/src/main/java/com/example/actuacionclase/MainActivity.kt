package com.example.actuacionclase

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.actuacionclase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var id=0
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton1.setOnClickListener {irNuevaActividad()
        }
        binding.boton2.setOnClickListener {seleccionarImagen() }

    } //llave de cierre del metodo onCreate

    private fun irNuevaActividad() {
        val intent = Intent(this,SeleccionarVideo::class.java)
        startActivity(intent)
    }

    private fun seleccionarImagen () {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type="image/*"
        register.launch(intent)
    }
    val register = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        if (it.resultCode== Activity.RESULT_OK){
            val intent = it.data
            binding.imagen1.setImageURI(intent?.data)
        }
    }

    private fun recuperarDatos() {
        val nombre=binding.nombre.text.toString()
        val apellido=binding.apellido.text.toString()
        val nota = binding.nota.text.toString()
        binding.informacion.setText("$nombre,$apellido,$nota")
    }
    private fun enviarDatos(){

    }
}