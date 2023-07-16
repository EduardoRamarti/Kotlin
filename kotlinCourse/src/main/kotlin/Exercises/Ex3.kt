package Exercises

fun main() {

    // Greeting:  Hello, Hi, Welcome, Good Morning, Hallo
    val greetings = arrayOf("Hello", "Hi", "Welcome", "Good Morning", "Hallo")

    // Introduction: my name is, you can call me, I use named, I'm
    val introductions = arrayOf("my name is", "you can call me", "I use named", "I'm")

    // Name
    val names = arrayOf("Ann", "Anahi", "anncode", "Irene", "Ani")

//    val randIndexGreeting = (Math.random() * greetings.size).toInt()
//    val randIndexIntro = (Math.random() * introductions.size).toInt()
//    val randIndexSize = (Math.random() * names.size).toInt()
//
//    val greeting = greetings[randIndexGreeting]

    val randGreet = randomIndex(greetings)
    val randInt = randomIndex(introductions)
    val randNames = randomIndex(names)

    val phrase = "$randGreet $randInt $randNames"

    println(phrase)
}

fun randomIndex(array:Array<String>):String{
    val randIndex = (Math.random() * array.size).toInt()
    return array[randIndex]
}