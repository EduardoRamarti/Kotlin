package conversionDeDatos

fun main () {
    //Metodos de conversion
    /*
    * toDouble()
    * toFloat()
    * toLong()
    * toInt()
    * toChar()
    * toShort()
    * toByte()
    * */

    val productLowStock:Byte = 20

    val productsInStock:Int = productLowStock.toInt()

    println(productsInStock)


    val numberString = "1"
    val numberByte:Byte = numberString.toByte()
    println("El numero Byte en Byte es: $numberByte")


    val numberDouble = numberString.toDouble()
    println("El numero Byte en Double es: $numberByte")


    //Simbolos
    val unicodeInt:Int = 0x2764
    val unicodeChar = unicodeInt.toChar()
    val unicode = unicodeChar.toString()
    println(unicode)

}