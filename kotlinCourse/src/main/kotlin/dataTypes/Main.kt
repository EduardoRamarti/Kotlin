package dataTypes

fun main() {
    //Tipo de dato entero:
    /*
    * Byte: -127 a 128
    * Short: 16	a -32768
    * Int: 32 a	-2,147,483,648 (-2 31)
    * Long: 64 a -9,223,372,036,854,775,808 (-2 63)
    */
    //Por default se establece Int cuando no se colocan el tipo de dato


    //Byte
    val age:Byte = 20

    //Int: 2 mil millones
    var productId = 21474867
    var productId2 = 2_221_474_867
    var productId3 = 2_221_474_868

    //long
    //9 trillones
    val userID = 8_333_444_555_666_111_111
    //Colocando una L al final del numero podemos indicar que estamos un usando un tipo de entero Long
    val userID2 = 8_333_444_555_666_111_111L


    //Tipo de dato Flotante:
    /*
    * Float: 6-7 decimales
    * Double: 15-16 decimales
    */

    val myDouble = 2.12345678912345
    val myFloat = 2.12345678912345F
    println(myDouble)
    println(myFloat)

    //Tipo de dato booleano
    /*
    * true
    * false
    */

    //Operadores Logicos
    /*
    * And && and
    * Or || or
    * Not ! not
    */

    val isLoggedIn = true
    val hasAddress = false

    //And
    // true & true = true
    // true & false = false
    // false & true = false
    // false & false = false

    //Or
    // true | true = true
    // true | false = true
    // false | true = true
    // false | false = false

    //Not
    // !true = false
    // !false = true

    println(isLoggedIn and hasAddress)
    println(isLoggedIn && hasAddress)
    println(isLoggedIn.and(hasAddress))

    println(!isLoggedIn) //false
    println(!isLoggedIn.not())



    //Tipos de dato Char
    // es de magnitud de 2 bytes

    //Secuencias de escape soportadas:
    /*
    * \t
    * \b
    * \n
    * \r
    * \'
    * \"
    * \\
    * \$
    */

    val keyInserted = 'm'
    val gender = 'F'
    println(keyInserted)
    println(gender)





}