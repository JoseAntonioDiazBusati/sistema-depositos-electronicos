package org.example
import org.example.Clases.Telefono
import org.example.Clases.Lavadora
import org.example.Clases.Coche

fun main() {
    val telefono = Telefono()
    telefono.encender()
    telefono.reiniciar()
    telefono.apagar()

    val lavadora = Lavadora()
    lavadora.encender()
    lavadora.apagar()

    val coche = Coche()
    coche.encender()
    coche.acelerar(70)
    coche.frenar(70)
    coche.apagar()
}