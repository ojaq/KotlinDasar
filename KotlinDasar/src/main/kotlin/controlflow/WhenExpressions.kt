package controlflow

fun main(){
    /*
    var statement = value
    when (statement) {
        option value 2 -> {block code}
        option value 1 -> {block code}
        else -> {block code}
    }
     */

    val start = 1
    var command: String = when (start) {
        3 -> "ready"
        2 -> "set"
        1 -> "go"
        else -> "nvm"
    }
    println(command)

    val finalExam = 'A'
    when (finalExam) {
        'A', 'B', 'C' -> println("Passed")
        'D' -> println("Remedial")
        else -> println("did not pass")
    }

    //range represent as option
    val score = 81
    when (score) {
        in 0..70 -> println("did not pass")
        in 71..99 -> println("passed")
        else -> println("did not join exam")
    }

    //check value with 'is' for option
    val type: Any = 5
    when (type) {
        is Boolean -> println("value is boolean")
        is String -> println("value is string")
        is Int -> println("value is int")
        else -> println("value is null")
    }
    val condition = true
    when (condition) {
//        is true -> println()
        else -> println()
    }
}