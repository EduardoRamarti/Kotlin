package estructurasControl

import kotlin.math.roundToInt

fun main() {
    val isLoggedIn = true
    when (isLoggedIn) {
        true -> println("Usuario Loggeado")
        false -> print("Usuario no loggeado")
    }

    // 1 - logged in
    // 0 - logged out
    // -1 - Down
    // 10 20 inactive time
    val userStatus = 17

    when (userStatus) {
        0 -> "Logged out"
        1 -> "Logged in"
        -1 -> "Down"
        else -> "Not Found"
    }

    val userStatusString = when (userStatus) {
        0 -> "Logged out"
        1 -> "Logged in"
        -1 -> "Down"
        //Para decir que si la opcion esta dentro de un rago utilizamos:
        in 10..20 -> "User inactvie for $userStatus minutes"
        else -> "Not Found"
    }

    println(userStatusString)



    val productPrices : Any = doubleArrayOf(15.99, 11.10, 45.99)

    val total = when (productPrices) {
        is DoubleArray -> productPrices.sum().roundToInt().toString()
        is Double -> productPrices.roundToInt().toString()
        is Int -> productPrices.toString()
        else -> productPrices.toString()
    }

    println("El total es $total")



    val hasAddress = true
    val user = "bokettoo"

    val message = when {
        isLoggedIn and hasAddress -> "Lista de direcciones de: $user"
        isLoggedIn and !hasAddress -> "$user no tiene lista de direcciones"
        else -> ""
    }
    println("message: $message")
}