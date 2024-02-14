class Rifle(nombre: String, municion: Int, municionARestar: Int, tipoDeMunicion: String): ArmasDeFuego(nombre, municion, municionARestar, tipoDeMunicion) {

    override var danio: Int = 0
        set(value) {
            require(value in 1..5)
            field = value
        }
    override var radio: String = ""
        set(value) {
            require(value == "Corto" || value == "Intermedio") { "El radio debe ser Corto o Intermedio." }
            field = value

        }

    override fun disparar() {
        TODO("Not yet implemented")
    }

    override fun recargar() {
        TODO("Not yet implemented")
    }

}