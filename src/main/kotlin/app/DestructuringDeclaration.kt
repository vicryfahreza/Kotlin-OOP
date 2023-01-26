package app

import data.Game
import data.Login
import data.MinMax

fun minMax(value1: Int, value2: Int): MinMax{
    return when{
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}

fun main() {
    val persona = Game("Persona 5", 600_000)
//    val name = persona.name
//    val price = persona.price
//    println(name)
//    println(price)
    val (name, price) = persona
    println(name)
    println(price)

//    val result = minMax(10, 100)
//    val min = result.min
//    val max = result.max
    val (min, _) = minMax(10, 100)
    println(min)
//    println(max)

    val login = Login("Vicry", "RahasiaBersama")
//    login(login){
//            login -> login.username == "Vicry" && login.password == "RahasiaBersama"
//    }
    login(login){
        (username, password) -> username == "Vicry" && password == "RahasiaBersama"
    }

}