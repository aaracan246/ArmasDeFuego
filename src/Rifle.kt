class Rifle(nombre: String, municion: Int, municionARestar: Int, tipoDeMunicion: String, danio: Int, radio: Radio): ArmasDeFuego(nombre, municion, municionARestar, tipoDeMunicion) {

    override var danio: Int = 0
        set(value) {
            require(value in 5..10) { "Un rifle tiene una potencia entre 5 y 10." }
            field = value
        }
    override var radio: String = ""
        set(value) {
            require(value == "Corto" || value == "Intermedio") { "El radio debe ser Corto o Intermedio." }
            field = value

        }

    override fun disparar() {
        if (municion >= 2){
            municion - municionARestar
            println("Se ha disparado 1 ${this.nombre}, quedan $municion disparos.")
        }
        else{
            recargar()
            disparar()
            if(cantidadMunicionExtra < 2){ println("No hay munición suficiente.") }

        }
    }

    override fun recargar() {
        TODO("Not yet implemented")
    }

}