package org.example.Clases

import org.example.Interfaces.EncendidoApagado

class Lavadora: EncendidoApagado {

    private var encendida = false

    override fun encender() {
        encendida = true
        println("Se ha encendido la lavadora")
    }

    override fun apagar() {
        encendida = false
        println("Se ha apagado la lavadora")
    }

}