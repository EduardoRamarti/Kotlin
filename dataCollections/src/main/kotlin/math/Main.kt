package math

import java.math.BigDecimal

fun main() {
    //BigDecimal es utilizado para trabajar con números decimales que necesitan
    // una precisión exacta y para evitar problemas de redondeo que podrían ocurrir con los tipos de punto flotante.

    val productPrices = listOf(
        BigDecimal(33.5),
        BigDecimal(99.99),
        BigDecimal(50.5),
        BigDecimal(10.5)
    )

        //count normal cuenta cuantos elementos hay
    val economyPrices =  productPrices
        .count{ //cuenta cuandos elementos hay que sean menores a 50
            it < BigDecimal(50)
        }
    println(economyPrices)

    var total = productPrices
        .sumOf {//se usa sumof por que estamos transformando cada elemento de la lista
            it.toBigInteger()
        }

    println(total)


    val randomPrice = productPrices.random() //retorna un elemento de la lista aleatoriamente
    println(randomPrice)

    val scores = listOf(5.0, 4.9, 4.6, 3.8)
    val averageScore = scores
        .average() //obtener el promedio de los datos
        .toFloat() //ese promedio lo convierte en flotante
    println(averageScore)

}