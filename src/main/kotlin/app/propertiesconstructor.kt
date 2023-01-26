package app

import data.User

fun main(){
    var user1 = User("Saber", "rahasia123")
    var user2 = User("Lancer", "rahasia")

    user1.username = "Assassin"
    user1.password = "sangatrahasia"

    println(user1.password)
    println(user2.password)
}