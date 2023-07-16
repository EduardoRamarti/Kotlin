package arrays

fun main (){
    //Este es un array de diferentes tipos
    // val myArray : Array<Any> = arrayOf()
    val myArray = arrayOf(1, "hola", 3.33F, 1000L, "c", true)
    println(myArray)
    println(myArray[1])

    myArray[1] = "adios"
    println(myArray[1])

    //Array Tipados
    /*
    * byteArrayOf() -> bytes
    * intArrayOf() -> int
    * doubleArrayOf() -> doubles
    * floatArrayOf() -> floats
    * arrayOf()
    */
    val emptyArray = emptyArray<Int>() // creando un array de enteros vacio

    val myByteArray = byteArrayOf(1,2,3)
    val myIntArray = intArrayOf(4,5,6,7,8)

    //CREANDO UN ARRAY VACIO CON TAMAÑO DEFINIDO
    val arrayInt = IntArray(5)

    val arrayInt2 = IntArray(5, { i:Int -> i.inc()}) // recibe el tamaño del array y una lambda
    //val arrayInt2 = IntArray(5)  { i:Int -> i } //se puede pasar la lambda por fuera del argumento

    //reccrido de los elementos dentro del array
    arrayInt2.forEach {//se auto declara it como la varaible que recibe el valor en el que va el recorrido
        println(arrayInt2[it])
    }


    val arrayBoolean = BooleanArray(3) {
        println(it) //diciendo que imprima el valor de cada indice
        true//diciendo que le ponga true a cada valor
    }

    arrayBoolean.forEach { //recorriendo cada valor
        println(it)
    }

}