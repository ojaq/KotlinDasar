package function

//high order function uses other function as parameter

fun main(){
    val upper = {value: String -> value.uppercase()}
    val lower = {value: String -> value.lowercase()}
    hello("ojaq", upper)
    hello("OJAQ", lower)
}

fun hello (value: String, transformer: (String) -> String) : String{
    return  "hello ${transformer(value)}"
}