package controlflow

fun main() {
    /*
    val variable/statement = value

    while (condition) {
        block of code/statement
        increment/decrement depends on condition
    }
     */

    var dzikir = 10
    while (dzikir >= 1) {
        //this code will execute until condition reach false value
        println("subhanallahu walhamdulillah walaa ilaaha illallah, allahuakbar")
        dzikir--
    }

    //TODO do-while loops
    /*
    val variable/statement = value

    do {
        block of code/statement
        increment/decrement depends on condition
    } while (condition)
     */

    var tasbih = 1
    do {
        // this do-while will execute block of code without checking condition first
        println("subhanallahu walhamdulillah walaa ilaaha illallah, allahuakbar")
        tasbih++
    } while (tasbih <= 3) // if value of condition is false, code will not loop
}