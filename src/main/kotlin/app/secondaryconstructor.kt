package app

import data.Address

fun main(){
    val address1 = Address("Jl A", "Jakarta")
    val address2 = Address("Jl A", "Jakarta", "Indonesia")

    println(address1.street)
    println(address2.street)

}