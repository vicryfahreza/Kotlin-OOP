package app

import data.Person

fun main(){
    val hori = Person()
    hori.firstName = "Hori"

    hori.sayHello("Felix", "Argyle")
}