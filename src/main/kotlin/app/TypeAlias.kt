package app

import data.Application
import java.util.function.Supplier

typealias App = Application
typealias Aplikasi = App
typealias App2 = data2.Application
typealias SupplierToString = () -> String

fun sayHello(supplier: SupplierToString){
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Aplikasi Baca Komik")
    val aplikasi = Aplikasi("Twitter")
    val app2 = App2("IMAGE TO PDF")

    sayHello {"Vicry"}
}