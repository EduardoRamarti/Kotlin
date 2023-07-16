package funcs

fun main() {

    //Declararla una lambda
    val printHola = {
        println("Hola Lambda")
    }

    //Una lambda minima es simplemente {} y se guardan en varaibles

    //Ejecutarla
    printHola()


    //Lambda con parametros
                    //parametro:tipoDeDato -> queSeRetorna
   val printText = {text:String ->
        println(text)
    }
    printText("Hola Lambda desde otra funcion")




    val addOneTo = {x:Int ->
        x + 1
    }
    println(addOneTo(4))



    //Se puede declarar una lambda como tipo de dato de una variable
    val addFiveTo: (Int) -> Int = { //igualarlo a la logica de la funcion
        it + 5
    }
    println(addFiveTo(10))



    val sum:(Int, Int, String) ->  Int = {x:Int, y:Int, message:String ->
        //los parámetros se mencionan nuevamente dentro del lambda para que se pueda acceder y utilizar sus valores
        // dentro del código del lambda. Esto permite que la función anónima se ejecute con los valores proporcionados
        // cuando se llama a sum
        val total = x + y
        println("$message $total")
        total
    }

    println(sum(1,2,"El resultado es:"))

}