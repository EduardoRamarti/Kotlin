package funcs

fun main() {

    val productPrices = doubleArrayOf(5.0,3.0,2.0)
    println(getProductPrices(productPrices, productPrices.size - 1 ))
}


//(5.0, 2.0, 3.0)
//

// Función recursiva que calcula la suma de los precios de los productos en el array productPrices
fun getProductPrices(productPrices: DoubleArray, maxIndex: Int): Double {
    // Caso Base: Si maxIndex es 0, significa que solo hay un elemento en el array, entonces simplemente retornamos ese valor.
    if (maxIndex == 0) return productPrices[0]

    // Caso Recursivo: Sumamos el precio del producto en la posición maxIndex al resultado de la función llamada con maxIndex - 1.
    // Esto se repetirá hasta que maxIndex sea 0, momento en el que se alcanza el caso base y comienza a retornar los valores hacia arriba.
    return productPrices[maxIndex] + getProductPrices(productPrices, maxIndex - 1)
}