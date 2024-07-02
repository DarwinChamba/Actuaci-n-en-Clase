package com.example.actuacionclase

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.actuacionclase.databinding.ActivityMain2Binding

class SeleccionarVideo : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.botonvideo.setOnClickListener{seleccionarVideo()}

    }//Llave de cierre onCreate

    private fun seleccionarVideo() {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type="video/*"
        register.launch(intent)
    }
    val register = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        if (it.resultCode== Activity.RESULT_OK){
            val intent = it.data
            binding.video.setVideoURI(intent?.data)
            binding.video.start()
        }
    }
}