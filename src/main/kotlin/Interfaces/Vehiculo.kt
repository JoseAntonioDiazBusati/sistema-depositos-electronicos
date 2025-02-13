package org.example.Interfaces

interface Vehiculo {

    var motorEncendido: Boolean
    var kmHora: Int

    fun acelerar(): Int

    fun frenar():Int
}