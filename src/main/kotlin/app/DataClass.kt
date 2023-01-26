package app

import data.Products

fun main() {
    val products = Products("Egg", 12000, "bahan makanan")

    val products2 = products.copy(name = "Ostrich Egg")
    println(products)
    println(products2)
}