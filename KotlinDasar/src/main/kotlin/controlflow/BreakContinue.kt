package controlflow

fun main(){
    //break is used to stop program from looping

    var i = 0
    while (true) {
        println("break me")
        i++
        if (i > 10) break
    }

    //continue is used for stopping the current loop to go to the next one`
    for (i in 1..10){
        if (i % 2 == 0) continue // stop program when iterate value is even
        println(i)
    }
}