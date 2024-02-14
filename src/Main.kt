abstract class ArmasDeFuego(protected val nombre: String,
                            protected val municion: Int,
                            protected var municionARestar: Int,
                            protected val tipoDeMunicion: String){



    abstract val danio: Int
    abstract val radio: String


    abstract fun disparar()

    abstract fun recargar()

    override fun toString() = "TODO"
}

fun main() {

}