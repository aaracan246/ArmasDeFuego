class Pistola(nombre: String, municion: Int, municionARestar: Int, tipoDeMunicion: String, danio: Int, radio: Radio): ArmasDeFuego(nombre, municion, municionARestar, tipoDeMunicion) {

    override var danio: Int = danio
        set(value) {
            require(value in 1..5) { "Una pistola tiene una potencia entre 1 y 5." }
            field = value
        }
    override var radio: String = ""
        set(value) {
            require(value == "Reducido" || value == "Corto") { "El radio debe ser Reducido, Corto." }
            field = value

        }

    override fun disparar() {
        if (municion >= 1){
            municion - municionARestar
            println("Se ha disparado 1 ${this.nombre}, quedan $municion disparos.")
        }
        else{
            recargar()
           // disparar() <- cae bucle infinito hasta que se acaben las balas
            if(cantidadMunicionExtra < 1){ println("No hay munición suficiente.") }

        }
    }

    override fun recargar() {
        TODO("Not yet implemented")
    }
}