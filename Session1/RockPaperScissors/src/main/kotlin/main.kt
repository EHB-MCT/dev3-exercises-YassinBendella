fun main() {
    val options = arrayOf("Rock", "Paper", "Siccors")
    val computerChoice = options.random()
    val userChoice = (options)

    println("Computer picked $computerChoice")
    println("You chosed picked $userChoice")
    determineWinner(computerChoice, userChoice)
}

