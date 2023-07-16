package funcs

//Las funciones de orden superior son aquellas que reciben una funcion como argumento y retornan otra
fun main() {

    val isValid = isValid(5){
        it > 4
    }
    println(isValid)



    //Llamamos la funcion y le pasamos la segunda funcion como parametro
    consultProductId (getOnNextProductIdBehavor())
}



//fun isValid(x:Int,validate: (x:Int)-> Boolean):Boolean{
//    return validate(x)
//}
fun isValid(x:Int,validate: (x:Int)-> Boolean):Boolean = validate(x)
//se crea una funcion que recibe un entero como parametro y una lambda como segundo parametro, retornando un Booleano
//la lambda recibe un entero y esta misma retorna un booleano



fun consultProductId(onNext: (productId: String) -> Unit){ //funcion recibe una Lambda. La lambda recibe un string y retorna un Unit (void)
    //80
    //Api
    val productId = "WERT123" //inicializo mi string
    onNext(productId) //Llamo a la funcion y le paso el string
}



//Esta segunda funcion no recibe argumentos, y retornara una lambda
fun getOnNextProductIdBehavor():(productId:String) -> Unit{ //La lambda recibe un string y retorna un Unit(void)
    return {//declaramos la lambda que se retorna. It sera el string con el que se llamo en anterioridad esta func
        println("Go to Product Detail screen with product id: $it")
    }
}