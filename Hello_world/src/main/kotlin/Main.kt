

fun main (){
    val names = arrayOf("Rob", "Cossima", "Yassin", "Amine", "Tuur")
    println("hello world")
    for (name in names) {
        greetingNames(name);
    }

}

fun greetingNames(name: String) {
    println("hello $name")
}