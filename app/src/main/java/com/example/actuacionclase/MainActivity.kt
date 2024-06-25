package com.example.actuacionclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.actuacionclase.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private var id=0
    private lateinit var biding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        biding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(biding.root)

        biding.ingresar.setOnClickListener{ Toast.makeText(this, "cualquier mensaje", Toast.LENGTH_SHORT).show()}
        }

    }
