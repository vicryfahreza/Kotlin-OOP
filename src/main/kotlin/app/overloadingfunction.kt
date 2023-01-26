package app

import data.Person

fun main(){
    val enkidu = Person()
    enkidu.firstName = "Enkidu"

    enkidu.sayHello("Gillgamesh")
    enkidu.sayHello("Thomas", "Frederick")
}