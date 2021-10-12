import java.awt.Choice

fun main(){
    println("Welcome to GUESS THE COLOR")
    challengeOne()
}

fun challengeOne(){
    println("Which color is the sky?")
    println("1. green, 2. red, 3. blue")

    val options = setOf<String>("green", "red", "blue")

    println("Your choice: ")
    val userChoice = readLine()!!

    if (options.contains(userChoice)){
        println("CORRECT")
        challengeTwo()
    }
    else{
        //gameOver()
    }
}

fun challengeTwo(){
    val diceResult = (1..6).random()
    val userAnswer = readLine()

    if (userAnswer == "low"){
        if ((1..3).contains(diceResult)) {
            //Winner
        } else {
            //gameOver()
        }
    } else {
        if((4..6).contains(diceResult)) {
            //Winner
        } else {
            //gameOver()
        }
    }
}
