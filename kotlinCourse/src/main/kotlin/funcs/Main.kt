package funcs

fun main() {
    //Estos son los mensajes que recibiremos
    // "My Fabulous App"
    // "Welcome to the best expirience
    // "Eduardo"

    //Este es el formato que esperamos se retorne
    // "***** My Fabulous App *****"
    // "**** Welcome to the best expirience ****"
    // "** Eduardo **"


    //Diseñando la funcion
    val appName = StringBuilder("My Fabulous App")

    //stringBuilder
    appName.insert(0, " ")
    appName.insert(appName.length, " ")

    for (i in 0 until 5){
        appName.insert(0,"*")
        appName.insert(appName.length,"*")
    }
    println(appName.toString())




    //Llamamos a la funcion y le pasamos los strings
    val welcome = "Welcome to the best expirience"
    val name = "Eduardo"

    println(addStarsFormat(welcome,4))
    println(addStarsFormat(name,2))
}

//Creando la funcion
fun addStarsFormat(text:String, stars:Int): String{ //Funcion recibe dos argumentos de tipo string y retorna un string
    val textConverted = StringBuilder(text)
    //Los strings no son mutables, para poder modificar un string es necesario utilizar la funcion StringBuilder

    //stringBuilder
                        //posicion, str a insertar
    textConverted.insert(0, " ")//Aqui le agregamos un espacio al inicio
    textConverted.insert(textConverted.length, " ")//Aqui le agregamos un espacio al final

    //Este ciclo nos ayudara a agregar las estrellas
    for (i in 0 until stars){// inicia en 0 hasta el numero que se le pasa a la funcion
        textConverted.insert(0,"*")
        textConverted.insert(textConverted.length,"*")
    }
    return textConverted.toString() //regresa el string con el nuevo formato
}

//Una funcion con sobrecarga:
fun addStarsFormat(text: String): String = addStarsFormat(text, 2)