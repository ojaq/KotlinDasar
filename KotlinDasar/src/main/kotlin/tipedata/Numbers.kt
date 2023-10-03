package tipedata

fun main(){
    /*
    Kotlin has a system called Type Inference
    it is used for auto-detecting the type of data by value
    Kotlin will recognize variable height as Int
    This is because the value is number and variable has no type data chosen before
    */
    var height = 180

    /*
    variable age is recognized by the type data of byte
    because it chose byte before assigning the value
    */
    var age: Byte = 19

    var distance: Short = 3000

    /*
    use _ to write huge number so, it is easy to read
    this variable identify as Long because its number is too long for Int
    */
    var balance = 999_999_999_999_999_999

    // give L at the end of number of value to type variable as type data Long
    var ccNumber = 1234_5678_9081_3456L

    // system will recognize floating point number than Double by default
    var latitude = 102.28164821

    //give F at the end of number of value to type variable as type data Float
    var longitude = 90.41232F

    // TODO Conversion
    // We can change type of data using conversion
    // 1. create a var to put our result of conversion
    // 2. type a data type before assign a value
    // 3. call method
    var number : Byte = 100
    var short: Short = number.toShort()
    var byte: Int = number.toInt()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()
}