package function

fun main() {
    salam(name = "t", message = ",test")
    val sumresult = sum(10, 9)
    println(sumresult)
    greetings("jaq")
    sumN(1,2,2,4,5,1242)
    final("anywhat", 1,2,3)
}

// function is a block of code built intentionally in a program to be used multiple times

/*
fun FunctionName(parameter) {
    body function/block of code
}
 */

// fun is keyword to declare a function
// FunctionName must be represented about task it contains
// parameter can be more than 1
// parameter can have a default value


//function as default returning unit
//we can change return type of function with colon : after bracket ()
//write type of data you want to return from function after colon :
//keyword return will need to declare in body function
//put your value want to return after keyword return
fun salam(name: String = "ojaq", message: String) : String{
    return "assalamualaikum, $name \n$message"
}

fun sum(n1: Int, n2: Int): Int {
    return n1 + n2
}

//TODO single expression function
fun greetings (name: String) = println("salam $name")

//Todo Varargs parameter
//vararg is a keyword that can be used in a parameter
//so last parameter can store more than 1 same type value
fun sumN(a: Int, vararg b: Int) = println(a+b.sum())

fun final(name: String, vararg values: Int){
    var total = 0.0
    for (data in values) total += data
    total /= values.size
    println("final value $name = $total")
}
