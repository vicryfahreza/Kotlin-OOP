package app

import data.Fruit

fun main() {
    val fruit1 = Fruit(100)
    val fruit2 = Fruit(50)
    val fruit3 = fruit1 + fruit2
    println(fruit3)

    val fruit4 = fruit3 - Fruit(20)
    println(fruit4)
}