package app

import data.SmartPhone

fun main() {
    val Xiaomi = SmartPhone("Xiaomi", "Android")

    println(Xiaomi.toString())
    println(Xiaomi.hashCode())
}