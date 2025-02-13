package org.example.Interfaces

interface Vehiculo {

    val motorEncendido: Boolean
    val kmHora: Int

    fun acelerar(): Int

    fun frenar():Int
}