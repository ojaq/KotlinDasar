package controlflow

fun main (){
    /*
    for (iterate/i in datas) {
        block of code using iterate/i
        sometimes maybe need increment or decrement
    }
     */

    val attendance = arrayOf("Bagidil", "Buchori", "Jaja", "Ucup")
    for (name in attendance){
        // when name get index0 -> will get data in attendance which index 0
        // value index 0 in attendance is bagidil
        // this iterate name represent index
        // and iterate will automatically increase until condition reach condition false
        print("$name ")
    }

    println()

    for (number in 1..5){
        print(number)
    }

    println()

    val name = "Ojaq"
    for (character in name){
        print("\"$character\"")
    }
}