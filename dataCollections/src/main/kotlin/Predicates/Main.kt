package Predicates

fun main() {
    val ages = listOf(12,22,17,30,29,15)

    //Las lambdas que devuelven un tipo de dato booleano se le conocen como predicados
    val adultAges = ages.filter {
        it >= 18
    }

    println(adultAges.joinToString())

    val kidAges = ages.filterNot {
        it >= 18
    }

    println(kidAges.joinToString())

    //partition devuelve un pair de dos listas
    //La primera son los datos que cumplan la condicion
    //La segunda seran aquellos que no cumplan la condicion
    val allAges = ages.partition {
        it >= 18
    }

    val adultAges2 = allAges.first
    val kidAges2 = allAges.second
    println(adultAges2.joinToString())
    println(kidAges2.joinToString())


    val data = listOf("One", null, "Two", null, null, "Three")
    val dataNotNull = data.filterNotNull() //Regresa la lista sin datos null
    println(dataNotNull.joinToString())


}