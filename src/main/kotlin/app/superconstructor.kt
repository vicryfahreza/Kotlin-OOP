package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main(){
    val premiumCustomer = PremiumCustomer("Vicry")
    println(premiumCustomer.name)


    val executiveCustomer = ExecutiveCustomer("Vicry", 1000000000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}