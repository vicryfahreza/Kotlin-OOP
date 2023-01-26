package app

import data.Application
import data.Utilities

fun main() {
    Utilities.name = "Diubah"
    println(Utilities.toUpper("Vicry"))
    a()
    b()

    //Companion Object
    println(Application.Companion.toUpper("Thomas"))
    println(Application.toUpper("Thomas"))
}

fun a(){
    println(Utilities.name)
}

fun b(){
    println(Utilities.name)
}