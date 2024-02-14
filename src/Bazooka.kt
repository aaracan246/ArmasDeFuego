class Bazooka(nombre: String, municion: Int, municionARestar: Int, tipoDeMunicion: String, danio: Int, radio: Radio): ArmasDeFuego(nombre, municion, municionARestar, tipoDeMunicion) {

    override var danio: Int = 0
        set(value) {
            require(value in 10..30) { "Un bazooka tiene una potencia entre 10 y 30." }
            field = value
        }
    override var radio: String = ""
        set(value) {
            require(value == "Intermedio" || value == "Enorme") { "El radio debe ser Intermedio o Enorme." }
            field = value
        }

    override fun disparar() {
        if (municion >= 3){
            municion - municionARestar
            println("Se ha disparado 1 ${this.nombre}, quedan $municion disparos.")
        }
        else{
            recargar()
            disparar()
            if(cantidadMunicionExtra < 3){ println("No hay munición suficiente.") }

        }
    }

    override fun recargar() {
        TODO("Not yet implemented")
    }

    override fun toString() = ""
}