package tipedata

fun main() {
    // in kotlin to declare an array use array for type data after name of the variable
    val members: Array<String> = arrayOf("abdur", "razaq", "ojaq")
    val balance: Array<Int> = arrayOf(100, 200, 300)
    val arrMix: Array<Any> = arrayOf("ojaq", "male", 15, 60, true)

    //nullable array
    val names: Array<String?> = arrayOfNulls(5)
    val nicknames: Array<String?> = arrayOf()
    nicknames.set(0, "ojaq")
    nicknames.set(1, null)
    nicknames.set(2, "jaq")

    println(names.get(0))
    println(nicknames[0])
}