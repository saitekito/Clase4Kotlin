package com.example.clase48_9.clases

class Menor(
    nombre: String,
    edad: Int,
    colegio: String,
    actividad: Actividad


):Persona(nombre,edad)

{
    override fun obtenerNombre(): String {
        TODO("Not yet implemented")
    }

    override fun obtenerEdad(): String {
        TODO("Not yet implemented")
    }

}
enum class Actividad {
    FUTBOL,
    DANZA,
    PINTURA,
    HANDBALL,
    GUITARRA

}