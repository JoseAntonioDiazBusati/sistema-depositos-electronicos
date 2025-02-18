package org.example.Clases

import org.example.Interfaces.EncendidoApagado
import org.example.Interfaces.Vehiculo


class Coche(): Vehiculo, EncendidoApagado {

    override var kmHora: Int = 0
    override var motorEncendido: Boolean = false

    override fun apagar() {
        motorEncendido = true
        println("Se ha encendido el motor")
    }

    override fun encender() {
        motorEncendido = false
        println("Se ha apagado el motor")
    }

    override fun acelerar(velocidad: Int): Int {
        if (motorEncendido){
            kmHora += velocidad
        } else {
            println("No se puede acelerar, el motor está apagado.")
        }
        return kmHora
    }


    override fun frenar(velocidad: Int): Int {
        if (motorEncendido){
            kmHora -= velocidad
        }else {
            println("No se puede frenar, el motor está apagado.")
        }
        return kmHora
    }
}