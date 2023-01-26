package app

import data.Boss

fun main(){
    val vicry = Boss("Vicry")

    val employe1 = vicry.Employee("Alluka")
    val employe2 = vicry.Employee("Joiness")

    employe1.hi()
    employe2.hi()
}