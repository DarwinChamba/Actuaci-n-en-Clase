package com.example.actuacionclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.actuacionclase.util.User

class MainActivity : AppCompatActivity() {
    private lateinit var btnAdd:Button
    private lateinit var imprimirLista:Button
    private var id=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd=findViewById(R.id.agregarUsuario)
        imprimirLista=findViewById(R.id.imprimirLista)
        btnAdd.setOnClickListener {
            addUser()
        }
        imprimirLista.setOnClickListener {
            imprimir()
        }
    }
    private fun addUser(){

        val user= User(id ++,"Darwin",6f,"")
        Data.lista.add(user)
        Toast.makeText(this,"Usuario regustrado con exito",Toast.LENGTH_SHORT).show()
    }
    private  fun imprimir(){
        Data.lista.forEach {
            println("${it.nombre} ${it.calificacion} ${it.nota} ${it.id}")
        }
    }
}