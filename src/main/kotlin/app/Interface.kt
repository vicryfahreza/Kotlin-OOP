package app

import data.Human

fun main() {
    val human = Human("Vicry")
    human.sayHello("Roswall")
    human.go()

    human.move()
}