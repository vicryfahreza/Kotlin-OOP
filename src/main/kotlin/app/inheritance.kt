package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    var echidna = Employee("Echidna")
    echidna.sayHello("Ryuzu")

    var misaki = Manager("Misaki")
    misaki.sayHello("Misaka")

    var loid = VicePresident("Loid")
    loid.sayHello("Yor")
}