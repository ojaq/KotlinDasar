package function

fun main(){
    "sumtin".printing()
    "otherthings".intern() //default extension functions from string
}

fun String.printing(){
    println(this)
}