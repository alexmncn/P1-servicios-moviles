package com.alexmncn.practica1

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)


        val nombre = intent.getStringExtra("nombre")
        val apellidos = intent.getStringExtra("apellidos")
        val textView3 = findViewById<TextView>(R.id.textView3)
        textView3.text = "Nombre: $nombre"
        val textView4 = findViewById<TextView>(R.id.textView4)
        textView4.text = "Apellidos: $apellidos"
    }
}