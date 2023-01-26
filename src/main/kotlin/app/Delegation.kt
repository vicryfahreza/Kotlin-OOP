package app

import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("Vicry")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Tohma")
    baseDelegate.sayGoodBye("Ayato")
}