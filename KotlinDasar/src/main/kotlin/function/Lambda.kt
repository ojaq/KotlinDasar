package function

fun main(){
    //lambda expression is a function that doesn't have a name
    //lambda declares without keyword fun
    //have a return type which automatically identified by system
    //parameter is represented as it by default
    //we can change name of parameter using separator '->' after name

    //TODO lambda in variable
    val nameContainLambda: (String) -> String = {
        it.uppercase()
    }
    println(nameContainLambda("jaq"))

    //TODO method references
    val containLambda: (String) -> String = ::toUpper
    println(containLambda("jaq"))

    //TODO lambda param
    val lambdaSum = {a: Int, b: Int ->
        val result = a + b
        println(result)
    }
    lambdaSum(19, 5)
}

fun toUpper(value: String): String = value.uppercase()