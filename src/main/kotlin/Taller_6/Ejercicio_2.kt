package Taller_6

//region funciones externas
fun main() {

    println("BIENVENIDO AL EDIFICIO DE LA EAN")
    println("Por favor cree un ascensor")
    println("Ingrese el numero de pisos")
    val pisos: Int = readln().toInt()
    println("Ingrese el numero de sotanos")
    val sotanos: Int = readln().toInt()
    println("Ingrese el piso actual")
    val actual: Int = readln().toInt()

    val ascensor = Ascensor(pisos, sotanos, actual)

    println("MENU (escoja una opcion)")
    println("1.validar piso actual\n2.subir piso\n3.bajar piso\n4.total de pisos")

    when (readln().toInt()) {
        1 -> println("El piso Actual es ${ascensor.pisoActual}")
        2 -> ascensor.subirUnPiso()
        3 -> ascensor.bajarUnPiso()
        4 -> println("los pisos totales del edificio son ${ascensor.cantidaDePisoTotales()}")
    }

}
//endregion

//region Objetos

class Ascensor(
    private var pisosEdificio: Int, private var sotanosEdificio: Int,
    var pisoActual: Int
) {

    //region modificadoras
    fun setPisos(n_pisos: Int) {
        if (n_pisos != 0)
            this.pisosEdificio = n_pisos
    }

    fun setSotanos(n_sotanos: Int) {
        if (n_sotanos != 0)
            this.sotanosEdificio = n_sotanos
    }

    fun setActualPiso(n_piso_a: Int) {
        if (n_piso_a != 0)
            this.pisoActual = n_piso_a
    }
    //endregion


    //region funciones
    fun subirUnPiso() {
        var pisoASubir = pisoActual + 1

        if (pisoASubir > pisosEdificio)
            println("El edificio  solo tiene $pisosEdificio pisos, no puede subir mas!")
        else if (pisoASubir == 0) {
            pisoASubir = 1
            println("====================>>")
            println("subio al piso $pisoASubir")
        } else {
            println("====================>>")
            println("subio al piso $pisoASubir")
        }

    }

    fun bajarUnPiso() {
        var pisoABajar = pisoActual - 1

        if (pisoABajar == 0) {
            pisoABajar = -1
            println("====================>>")
            println("Bajo al piso $pisoABajar")
        } else if (pisoABajar < 0 && pisoABajar < -sotanosEdificio)
            println("no puede bajar mas!")
        else {
            println("====================>>")
            println("Bajo al piso $pisoABajar")
        }

    }

    fun cantidaDePisoTotales(): Int {
        return this.pisosEdificio + this.sotanosEdificio
    }
    //endregion
}
//endregion
