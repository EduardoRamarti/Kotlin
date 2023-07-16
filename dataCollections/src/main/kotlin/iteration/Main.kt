package iteration

fun main() {
    //TODAS las colecciones siguientes son en su version (o forma) inmutable
    println("LIST")

    val list = listOf(1,2,3)
    //                0,1,2
    println("Value on index 0: ${list[0]}")
    println("Iterando la lista")
    list.forEach{
        println(it)
    }

    println()

    println("SET") //NO acepta valores repetidos y Sus elementos no tiene un orden(no tienen indice)
    val set = setOf(1,2,2,2,3,4)
    println("Set size: ${set.size}")
    println("Iterando un set ")
    set.forEach {
        println(it)
    }

    println("Set of Names")
    val names = setOf("Edd","Eduardo","Edd") //eliminara el repetido
    println("Iterando el set:")
    names.forEach {
        println(it)
    }
    println()
    println("Maps") // concodios como diccionarios
    val map = mapOf(
        1 to "Eduardo",
        2 to "Jake",
        3 to "Ramsey"
    )

    println("Iterando un mapa")
    map.forEach {
        val item = it.key
        val name = it.value
        println("$item. $name")
    }


}