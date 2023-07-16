package split

fun main() {
    val superMarket = listOf(
        "Milk",
        "Eggs",
        "Juice",
        "Meat",
        "Rice"
    )

    //n primeros elementos
    val breakfast = superMarket.take(3)
    println(breakfast.joinToString())

    //n ultimos elementos
    val dinnerList = superMarket.drop(3)  // drop regresa n elementos, pero no el primero de estos 3.
                                             // devolveria Meat, rice. Por lo que siempre se agrega uno más a la catnidad real de elementos que quieres regrar

    println(dinnerList.joinToString())


    //Haciendo uso de la programacion funcional. Podemos agregar más metodos que funcionene de la misma manera con nuetras listas
    val breakfast2 = superMarket
        .take(3) //Regresaria Milk, Eggs, Juice
        .filterNot {//Pero entra al filter y quita Eggs. para regresar Milk, Juice
            it == "Eggs"
        }
    println(breakfast2.joinToString())
}