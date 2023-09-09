package com.example.clase48_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.clase48_9.clases.Adulto
import com.example.clase48_9.clases.EstadoCivil
import com.example.clase48_9.clases.Persona

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rodolfo = Adulto(nombre = "rodolfo",edad = 29, profesion = "estudiandte", estadoCivil = EstadoCivil.SOLTRERO)
        Toast.makeText(this, rodolfo.obtenerNombre(), Toast.LENGTH_LONG).show()








    }
}