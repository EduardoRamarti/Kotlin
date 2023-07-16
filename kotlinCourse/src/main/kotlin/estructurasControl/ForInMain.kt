package estructurasControl

fun main() {
    /*
    * Generar Rangos
    *
    * Generando un rango de 1 a 3 (1,2,3)
    * Forma 1:
    * 1..3
    *
    * Forma 2:
    * 1.rangeTo(3)
    *
    * Genenrando un rango de caracteres (a,b,c,d)
    * Forma 1:
    * 'a'..'d'
    *
    * Forma 2:
    * 'a'.rangeTo('d')
    *
    *
    * Genenrar un rango decreciente:
    * 'd'.downTo('a')
    * 3.downTo(1)
    * */



    /*
    * Ciclo ForIn
    *
    * Con rangos:
    * for (n in 1..3){
    *   println(n)
    * }
    *
    * Con arrays:
    * for (greeting in greetings){
    *   println(greeting)
    * }
    *
    * */


    for (i in 0..4){
        println(i)
    }

    println()

    for (i in 'a'..'c'){
        println(i)
    }

    println()

    for (i in 'c'.downTo('a')){
        println(i)
    }

    val greetings = arrayOf("Hola", "Bienvenido", "Hi", "Buenos dias", "Hello")

    for (greeting in greetings){
        println(greeting)
    }

    println()

    for (i in 0..greetings.size - 1){
        println(greetings[i])
    }

    //Alternativa a utilizar greetings.size - 1
    for (i in 0 until greetings.size){
        println(greetings[i])
    }

    for (i in greetings.indices){
        println(greetings[i])
    }


}