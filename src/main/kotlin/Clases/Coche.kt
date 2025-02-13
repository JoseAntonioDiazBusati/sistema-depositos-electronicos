package org.example.Clases

import org.example.Interfaces.Vehiculo


class Coche(): Vehiculo {

    override var kmHora: Int = 0
    override var motorEncendido: Boolean = false


    override fun acelerar(): Int {
        if (motorEncendido != false){
            kmHora += 20
        }
        return kmHora
    }


    override fun frenar(): Int {
        if (motorEncendido != false){
            kmHora = 0
        }
        return kmHora
    }
}