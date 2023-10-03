package operator

fun main () {
    //operator that compares 2 boolean data and has an output of boolean (true/false)
    val officeOpen = 7
    val officeClosed = 15
    val now = 20

    //operator and (&&)
    //operator will output value true only if both conditions are true
    val isOpen = now >= officeOpen && now <= officeClosed
    println(isOpen)

    //operator or (||) lazy disjunction
    //operator will output true if there's 1 true condition
    val isClosed = now < officeOpen || now >officeClosed
    println("Office is closed : $isClosed")
}