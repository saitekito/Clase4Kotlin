package com.example.clase48_9.clases

class Adulto (
    private  val nombre: String,
    private val edad: Int,
    private val profesion: String,
    private val estadoCivil: EstadoCivil
):Persona(nombre,edad )
{
  override fun obtenerNombre(): String {
      return "Mi nombre es: ${this.nombre}"
  }
    override fun obtenerEdad(): String {
        return "Mi nedad es: ${this.edad}"
    }
    fun obtenerProfesion(): String {
        return "Mi profecion es: ${this.profesion}"
    }
    fun obtenerEstadoCivil(): String {
        return "Mi profecion es: ${this.profesion}"
    }
}
enum class EstadoCivil {
    CASADO,
    SOLTRERO,
    DIVORCIADO,
    CONYUGE,
    VIUDO

}