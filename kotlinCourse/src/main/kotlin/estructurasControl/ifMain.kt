package estructurasControl

fun main() {
    val isLoggedIn = true
    val hasAddress = false

    // if user if logged in
        // if hasAddress
            // Show Adress List
        // !hasAddress
            // User has not Adresses
    // user is not logged in
        // message  user is not logged in

    if (isLoggedIn) {
        println("Usuario esta logeado")
        if (hasAddress) {
            println("Mostrar lista de direcciones")
        }else{
            println("El usuario no tiene direcciones")
        }
    } else {
        println("Usuario no logeado")
    }

    //Operador ternatrio
    // Los valores que devuelve el if deberan de ser del mismo tipo de dato con el que se declaro la variable
    val userLoggedInStatus = if (isLoggedIn) "Usuario esta logeado" else "Usuario no logeado"
}