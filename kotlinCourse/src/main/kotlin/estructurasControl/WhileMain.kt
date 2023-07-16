package estructurasControl

fun main() {
    val greetings = arrayOf("Hola","Te doy la bienvenida","Hi", "Buenos dias", "hallo")

    // Instead of doing this...
    /*
    greetings[0]
    greetings[1]
    greetings[2]
    greetings[3]
    greetings[4]
    */
    var i = 0
    while (i <= greetings.size - 1 ) { //mientras i sea menor o igual al tamaño del arreglo menos 1
        println(greetings[i])
        i++
    }
    //Do this ...
    println(greetings.size) //imprime el tamaño del array


    println()

    // Recorriendo el arreglo utilizando un ciclo do-while
    var j = 0
    do {
        val greeting = greetings[j] // Guarda el elemento actual del arreglo en la variable greeting
        println(greeting)
        j++
    } while (greeting.length > 2 && j < greetings.size - 1) //Mientras el largo del array sea mayor a 2 y j sea menor al tamaño del array menos uno

    println("Continuando")

    // Recorriendo el arreglo utilizando un ciclo while con una declaración de continue
    var k = 0
    while(k < greetings.size - 1){ //mientras k sea menor al tamaño del array menos 1
        val greeting = greetings[k]
        println(greeting)
        k++
        if (greeting.length <= 2) continue //si el largo es menor o igual a 2, salta a la siguiente iteracion
        println("Continuando en while")
    }
    println("Termino el while")
}