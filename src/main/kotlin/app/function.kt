package app

import data.Person

fun main(){
    val ayato = Person()
    ayato.firstName = "Kamisato"
    ayato.middleName = "Uciha"
    ayato.lastName = "Ayato"

    ayato.sayHello("Ayaka")
    ayato.getRun()
    ayato.getFullName()
}