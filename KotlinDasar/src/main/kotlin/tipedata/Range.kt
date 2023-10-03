package tipedata

fun main() {
    // type data with value is just number of range
    // mark .. is used to identify the range
    val range = 0..10

    // foreach is used to get all data from range
    // data in range is represented by lambda
    range.forEach {print(it)}

    // mark downTo use to identify range down to
    // use keyword step when you want to step by value
    val reverseRange = 10 downTo 0 step 2
    reverseRange.forEach{print(it)}

    println()

    val count = 1.rangeTo(5)
    // we can change lambda parameter with other name
    // index and value is the name of lambda parameter
    count.forEachIndexed { index, value ->
        println("index $index in count bernilai $value")
    }
}