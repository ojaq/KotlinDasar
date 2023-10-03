// TODO Constant Variable
// immutable global variable that can be accessed globally
// type the name of constanta with UPPER_CASE to identify as constanta
const val APP = "Kotlin Dasar"
const val CODE_VERSION = 1

fun main() {
    var name = "Abdurrazaq"
    var gender = "male"

    //TODO Variable & Immutable
    // use var to declare mutable variable
    // value in this var can be changed or modify
    name = "Abdurrazaq"
    var age = 15
    age = 16

    // use val to declare immutable variable
    // value in val cannot be changed or modify
    // you'll get an error if you change the value of variable val
//    desc = "sum"
    val phone = 231321321
//    phone = 321321312


    // TODO Variable Nullable
    //to put null value use ? after choosing type data of variable
    var nickname: String? = null
    nickname = "ojaq"

    var height: Int? = 178
    height = null
    // use nullable variable to call name of variable with ?
//    println(height.toDouble())
    // if you try to access variable height it'll show error
    println(height?.toDouble())

    println("App of $APP with code version $CODE_VERSION")
}