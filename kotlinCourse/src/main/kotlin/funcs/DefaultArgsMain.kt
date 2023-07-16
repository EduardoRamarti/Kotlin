package funcs

fun main() {

    showWelcomeMessage("hola")
    showWelcomeMessage("hi")
    showWelcomeMessage("Buenos dias")

    showWelcomeMessage("Buenos dias", "Eduardo")


}

//creando una funcion con argumentos inicializados por default
fun showWelcomeMessage(text:String, user:String = ""){
    val message = "$text $user".trim()
    println(message)
}