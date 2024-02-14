import kotlin.random.Random


enum class Radio {
    REDUCIDO, CORTO, INTERMEDIO, ENORME
}
abstract class ArmasDeFuego(
    val nombre: String,
    val municion: Int,
    var municionARestar: Int,
    private val tipoDeMunicion: String){

companion object{
    var cantidadMunicionExtra = Random.nextInt(5, 15)
}

    abstract val danio: Int
    abstract val radio: String


    abstract fun disparar()

    abstract fun recargar()

    override fun toString() = "TODO"
}

fun main() {

}