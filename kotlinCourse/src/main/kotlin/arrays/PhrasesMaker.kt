package arrays

fun main(){
    //Saludo + Introduccion + Nombre

    //Saludo: hola, hi, bienvenido, buenas
    //Introduccion: mi nombre es, puedes llamarme, usualmente me llaman, yo soy
    //Nombres: Eduardo, Lalo, Edu

    //Generando los arrays (colecciones)
    val greetings = arrayOf("Hola", "Bienvenido", "Hi", "Buenos dias", "Hello")
    val introductions = arrayOf("mi nombre es", "puedes llamarme", "usualmente me llaman", "yo soy")
    val names = arrayOf("Eduardo", "Lalo", "Edu", "Ed")

    //El valor de Math.random() (el cual es un double entre 0 y 1) lo multiplica por el tamaño de mi array
    //Luego ese valor lo convierte en entero (eliminando los decimales
    val randIndexGreeting = (Math.random() * greetings.size).toInt()
    val randIndexIntroductions = (Math.random() * introductions.size).toInt()
    val randIndexNames = (Math.random() * names.size).toInt()


    val phrase = "${greetings[randIndexGreeting]}, ${introductions[randIndexIntroductions]} ${names[randIndexNames]}"
    println(phrase)
}
/*
* Estructuras de Control
* if / else
* for - ciclos
* try/catch/finally
* while and do ... while - ciclos
* when - switch case mejorado
* */