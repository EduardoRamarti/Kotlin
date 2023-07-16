package Exercises

fun main() {

    val responses = arrayOf("Usa un Abrigo hace frío", "Te irá bien si usas una Chaqueta, el clima es templado", "Es mejor que lleves algo ligero, hace calor")

    print("Ingresa la temperatura actual en ºC:")
    val weather = readLine()?.toInt()

    if ( weather != null ) {
        if (weather <= 20) {
            println(responses[0])
        } else if (weather in 21..30) {
            println(responses[1])
        } else {
            println(responses[2])
        }
    } else {
        println("El valor ingresado no es un numero")
    }
}