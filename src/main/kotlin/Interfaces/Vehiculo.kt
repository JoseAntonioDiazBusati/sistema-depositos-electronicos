package org.example.Interfaces

interface Vehiculo {

    var motorEncendido: Boolean
    var kmHora: Int

    fun acelerar(velocidad: Int): Int

    fun frenar(velocidad: Int):Int
}