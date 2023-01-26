package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    var employee = Employee("Vicry")
    employee.sayHello("Tono")

    employee = Manager("Rudi")
    employee.sayHello("Gilang")

    employee = VicePresident("Baskara")
    employee.sayHello("Wijaya")
}