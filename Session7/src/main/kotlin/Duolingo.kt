class Duolingo {
    val words = mutableSetOf<Word>(
        Word("chaise","stoel", "fr"),
        Word("aspirateur","stofzuiger", "fr"),
        Word("table","tafel", "fr"),
        Word("telephone","telefoon", "fr"),
        Word("ordinateur","computer", "fr"),
        Word("écran","scherm", "fr"),
        Word("maison","huis", "fr"),
        Word("souris","muis", "fr"),
        Word("jardin","tuin", "fr"),
        Word("clés","sleutels", "fr")
    )
    fun play() {
        val selectedWords = words.shuffled().take(5).toMutableSet()
        while (selectedWords.count()>0) {
            val selectedWord = selectedWords.random()
            println("Nog ${selectedWords.count()} woorden")
            println(selectedWord.original)
            val userAnswer = readLine()
            if (selectedWord.translated == userAnswer) {
                println("Correct!")
                selectedWords.remove(selectedWord)
            } else println("Het juiste antwoord was ${selectedWord.translated} !")
        }
        println("Je bent gewonnen!")
    }
}

