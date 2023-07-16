package transformation

fun main() {
    val languages = listOf(
        "Java",
        "Go",
        "Python",
        "kotlin",
        "Swift",
        "Kotlin"
    )

    //Language: Java
    //for
    //"Language: Java" newList.add
    //for newList
    //(String) -> (String)
    val strLanguages = languages.map {
        "Language: $it"
    }
    strLanguages.forEach {
        println(it)
    }

    println()

    //(Int) -> (String)
    val numbers = listOf(1,2,3)
    //La funcion map siempre devuelve una lista
    val items = numbers.map {
        "$it. Item"
    }

    println(items) //devuelve la lista sin formato(con todo y corchetes)

    println(items.joinToString())//joinToString itera la lista y regresa la misma separada por comas


    //DATA sucia
    val data= listOf("1", "2", "*", "3", "/")
    val dataNumbers = data.mapNotNull {
         it.toIntOrNull() //verifica si es un numero, de serlo lo regresa en su posicion, de lo contrario coloca un null en donde encontro un elmeento que no es entero

    }

    println(dataNumbers)
    val sum = dataNumbers.sum() //suma los elementos dentro de la lista
    println(sum)

}