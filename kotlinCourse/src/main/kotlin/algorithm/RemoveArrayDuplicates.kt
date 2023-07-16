package algorithm

fun main() {

    //Este es el array del ejercicio
    val numbers = intArrayOf(0,0,1,1,1,2,2,3,3,4)

    if (numbers.size > 1){ //el tamaño del array es mayor a uno?
        //Algorithm
        var j = 1
        for (i in 1 until numbers.size){ //i recorre los indices desde el 1 hasta el ultimo indice
            val left = i - 1 //left se inicializa con el valor del indice que tiene i y se le resta 1 para obtener el indice anterior
            if (numbers[i] != numbers[left]){ // si el valor de numbers con indice i es igual al valor de numbers con indice left
                numbers[j] = numbers[i] //entonces asignale a numbers en el indice j, el valor que este en numbers con indice i
                j++ //sumale una unidad a j
            }
        }

        //Colocar en los repetidos en 0
        for (k in j until numbers.size){ //recorre k los indices desde el valor que tiene j, hasta el ultimo indice de numbers
            numbers[k] = 0 // en esos indices coloca 0
        }
    }
    println(numbers.toList())
    //Los arrays apuntan a una direccion en memoria, por ello es necesario convertirlos a toList() para poder imprimir los valores
}