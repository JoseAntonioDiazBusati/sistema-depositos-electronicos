package org.example.Clases

import org.example.Interfaces.DispositivoElectronico
import org.example.Interfaces.EncendidoApagado

class Telefono: EncendidoApagado,DispositivoElectronico{

    var encendido: Boolean = false

    override fun apagar() {
        encendido = false
        println("Se ha apagado el telefono.")
    }

    override fun encender() {
        encendido = true
        println("Se ha encendido el telefono.")
    }

    override fun reiniciar() {
        if (encendido){
            println("Reiniciando...")
        }else{
            println("No se puede reiniciar, el telefono está apagado.")
        }
    }
}