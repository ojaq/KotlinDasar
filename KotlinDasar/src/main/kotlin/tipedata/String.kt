package tipedata

fun main() {
    /*
    type data String is used for store word, sentence, or paragraph in a variable
    put value of String between quotation mark " "
    */
    var name = "Abdurrazaq"
    var nickname = "ojaq"

    /*
    use 3 quotation mark to store your paragraph in variable
    notice the empty line in the same line with 3 of quotation mark """
    it is not included in paragraph and ir will be removed if its empty
    */
    var salam = """
        assalamualaikum warahmatullahi wabarakatuh
        thanks for your attendance
        i'll show you 
    """.trimIndent()
    println(salam)

    // there's other way to manage indentation for String of paragraph using """
    var introduce = """
        |me name's ojaq,
        |and i'm from south
    """.trimMargin()

    var address = """
        |nowhere street,
        |idn
    """.trimMargin(marginPrefix = ">")
    println(introduce)

    //TODO the operator can use for String is +
    val identity : String = name + " you can call me " + nickname
    print(identity)

    //this is a way to input value of other variable in String
    // use $ and call the name of the variable in String ""
    //use ${} and call the name of variable in {} to process the variable
    val desc = "Total $nickname character = ${nickname.length}"
    println(desc)
}