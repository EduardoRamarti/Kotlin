package stringTemplates

fun main(){
    //Tipo de dato Cadena
    // Son una secuencia de caracteres o charsequence
    val price = 15.25
    val tax = 0.16

    val out = "La cantidad de $price después de impuestos es: $${price * (1 + tax) }"
    println(out)

    val disclaimer = "La cantidad esta en \$MXN"
    println(disclaimer)


    val total = price.times( tax.plus(1) )
    println(total.toFloat())


}