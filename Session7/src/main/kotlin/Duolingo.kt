class Duolingo(val roundSize:  Int = 5, val language: String = "fr") {
    var words = mutableSetOf<Word>(
        EnglishWord("train", "trein"),
        EnglishWord("car", "auto"),
        FrenchWord("voiture", "auto"),
        FrenchWord("table", "tafel"),
        EnglishWord("plane", "vliegtuig"),
        FrenchWord("avion", "vliegtuig"),
        EnglishWord("chair", "stoel"),
        FrenchWord("ordinateur", "computer"),
        EnglishWord("train", "trein"),
        EnglishWord("train", "trein")
    )

    init {
        words = words.filter { it.language == language }.toMutableSet()
    }

    fun play(){
        println("Which language do you want to practice, fr or en?")
        val userLanguageChoice = readLine()
        if (userLanguageChoice == "fr"){

        }else if (userLanguageChoice == "en"){

        }else { throw Exception("Please, stop joking!") }

        val wordsSelection = words.shuffled().take(5).toMutableSet()
        while (wordsSelection.isNotEmpty()){
            val wordSelection = wordsSelection.random()
            println(wordSelection.original)
            val userAnswer = readLine()

            if (userAnswer == wordSelection.translated){
                wordsSelection.remove(wordSelection)
            }else {
                println(wordSelection.translated)
            }
            println(wordsSelection.count())
        }
    }

    fun playOld(){
        println("Which language do you want to practice, fr or en?")
        val userLanguageChoice = readLine()


        val wordsSelection = words.shuffled().take(5).toMutableSet()
        while (wordsSelection.isNotEmpty()){
            val wordSelection = wordsSelection.random()
            println(wordSelection.original)
            val userAnswer = readLine()

            if (userAnswer == wordSelection.translated){
                wordsSelection.remove(wordSelection)
            }else {
                println(wordSelection.translated)
            }
            println(wordsSelection.count())
        }
    }
}

