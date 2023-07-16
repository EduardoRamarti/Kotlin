package estructurasControl

import kotlin.system.measureNanoTime

fun main() {
    /*
    * for-in: es más familiar para aquellos que vienen de otros lenguajes de programación y proporciona
    * mayor control sobre la iteración, como acceder a los índices o saltar elementos.
    *
    * forEach: es más conciso y se enfoca en la lógica a aplicar a cada elemento sin preocuparse por los índices.
    * Además, puede aprovechar otras funciones de orden superior, como map o filter.
    *
    * En otras palabras, se refiere a utilizar forIn en arrays ya que estos reservan espacios de memoria consecutivos
    * y en su mayoria se manjan con indices
    *
    * Y lel forEach es más comun utilizarlo en listas, ya que este no reserva las direcciones consecutivas.
    * además que no se centra en los indices
    * */

    //Guardamos en la const forInRange, lo que nos devuelva la funcion lambda measureNanoTime
    //measureNanoTime es una funcion lambda la cual mide el tiempo de lo que se realiza dentro de ella
    val forInRange = measureNanoTime {
        for (i in 0..1000){ //Recorremos el rango con un for in desde 0 hasta 1000
            i
        }
    }

    val forEachRange = measureNanoTime {
        (0..1000).forEach { it } //Recorremos el rango con un forEach desde 0 a 1000
    }

    println("forInRange: $forInRange")
    println("forEachRange: $forEachRange")
    println()

    for (i in 0..100){ i }

    val objectList = (0..1000).toList()

    val forInList = measureNanoTime {
        for (i in objectList){
            i
        }
    }

    val forEachList = measureNanoTime {
        objectList.forEach { it }
    }

    println()
    println("forInList: $forInList")
    println("forEachList: $forEachList")

    //Si se va a recorrer rangos usar ForIn
    //Si se va a recorrer colecciones usar ForIn



}