package controlflow

fun main() {
    /*
    if (boolean condition) {
    if value of condition is true
    code if block will execute
    }
    */

    var a = 9 //statement
    var b = 19 //statement
    var max = a //statement

    if (a < b){
        max = b
    }

    //expression
    if (a < b) { //conditions will output true
        max = b  // value max have to change to value of b
    }
    println(max)

    var min: Int
    if(a > b) {
        min = b
    } else {
        min = a
    }
    println(min)

    //other way to write if expression
    min = if (a > b) b else a
    max = if (a > b) a else b

    //if there's more than 2 condition
    val start = 1
    var command: String
    if (start == 3) {
        command = "ready"
    } else if (start == 2){
        command = "set"
    } else if (start == 1){
        command = "go"
    } else {
        command ="nvm"
    }
    println(command)
}
