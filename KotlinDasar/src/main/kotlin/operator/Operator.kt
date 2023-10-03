package operator

fun main() {
    val x = 20
    val y = 7
    var a = 3

    val operator = (x + y - 2) / 5 * a
    println(operator)

    val result = operator % 4
    println(result)

    //operator augmented assignments
    a = a + 10 //a += 10
    a = a - 10 //a -= 10
    a = a * 10 //a *= 10
    a = a / 10 //a /= 10
    a = a % 10 //a %= 10

    // unary operator
//    ++ //a = a + 1
//    -- //a = a - 1
//    - //Negative
//    + //Positive
//    ! //Boolean kebalikan

}