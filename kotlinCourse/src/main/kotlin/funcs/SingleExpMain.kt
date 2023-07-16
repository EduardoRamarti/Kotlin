package funcs

fun main() {
    val welcome = getWelcome()
    println(welcome)
    println(cleanText(welcome))
}

//Esta es una funcion simple, ya que podemos agregar la devolucion de esta funcion en una sola linea
fun getWelcome() = "** Welcome to the best expirience **"

//Esta es otra forma de usar funciones simples, ya que es más facil de leer esos metodos que se utilizan en el string
//pero es lo mismo que hacer text.removePrefix("**").removeSuffix("**").trim()
fun cleanText(text:String): String = text
    .removePrefix("**")
    .removeSuffix("**")
    .trim()