package Exercises

fun main() {

    print("Username:")
    val username = readLine()
    print("Password:")
    val password = readLine()
   //println("$username $password")

    val usernameStored = "Eduardo"
    val passwdStored = "hola123"

    if (username == usernameStored && password == passwdStored){
        println("Bienvenido, de vuelta...")
    } else {
        println("Vuelve a intentarlo.")
    }
}