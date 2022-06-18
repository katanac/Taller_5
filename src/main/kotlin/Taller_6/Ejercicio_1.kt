package Taller_6

import kotlin.math.sqrt

class Pendulo {

    //region Atributos
    private var l: Double = 0.0
    private var a: Double = 0.0
    //endregion

    //region Constructores
    constructor()//primario

    constructor(l: Double, a: Double) {
        this.l = l
        this.a = a
    }
    //endregion

    //region Propiedades de clase

    //analizadoras
    fun getLongitud() = this.l
    fun getAceleracion() = this.a

    //modificadoras
    fun setLongitud(l_nuevo: Double) {
        if (l_nuevo != 0.0)
            this.l = l_nuevo
    }

    fun setAceleracion(a_nuevo: Double) {
        if (a_nuevo != 0.0)
            this.a = a_nuevo
    }
    //endregion

    //region Propios
    fun periodoOscilacionPendulo(): Double {
        return (2.0 * Math.PI) * (sqrt(this.a / this.l))
    }
    //endregion

}

data class PenduloDos(private var l: Double, private var a: Double) {
    //modificadoras
    fun setLongitud(l_nuevo: Double) {
        if (l_nuevo != 0.0)
            this.l = l_nuevo
    }

    fun setAceleracion(a_nuevo: Double) {
        if (a_nuevo != 0.0)
            this.a = a_nuevo
    }
    //endregion

    fun periodoOscilacionPendulo(): Double {
        return (2.0 * Math.PI) * (sqrt(this.a / this.l))
    }

}

fun main() {
    val x = Pendulo(2.0, 2.0)
    println("El periodo de oscilacion es ${x.periodoOscilacionPendulo()}")

    val x2 = PenduloDos(3.0, 2.0)
    println("El periodo de oscilacion 2 es ${x2.periodoOscilacionPendulo()}")

}