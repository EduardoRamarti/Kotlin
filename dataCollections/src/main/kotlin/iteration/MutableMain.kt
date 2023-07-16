package iteration

fun main() {
    println("Mutable List")
    //Apesar de ser declaradas como constante, si es posible modificar las listas
    val  mutableList = mutableListOf(1,2,3,3,4)

    //otra manera de pasar una lista normal a una mutable
    val list = listOf(1,2,3)
    val anotherMutableList = list.toMutableList()
//    val anotherMutableList: MutableList<Int> = list.toMutableList() //otra manera de utilizarlo

    //Añadir, remover o actualizar un elemento de la lista
    //añadir
    mutableList.add(5)
    //actualizar
    mutableList[3]=4
    //remover
    mutableList.removeAt(4)
    println("Iterando una mutable list")
    mutableList.forEach {
        println(it)
    }

    println()
    println("Mutalbe Set") //continua su naturaleza y no acepta duplicados
    val mutableSet = mutableSetOf(1,2,3,4,4,4)
    mutableSet.forEach {
        println(it)
    }

    println()

    println("Mutable Map")
    val mutableMap = mutableMapOf<Int, String>(
        1 to "Eduardo",
        2 to "Jake",
        3 to "Ramsey"
    )
    //actualizar un map
    mutableMap[4] = "James" // Alternativa -> mutableMap.put(4, "James")

    println("Iterando un mapa mutable")
    mutableMap.forEach {
        val item = it.key
        val name = it.value
        println("$item. $name")
    }
}