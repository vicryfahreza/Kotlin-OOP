package app

import program.MyApplication

fun main() {
    val app = MyApplication("Reddit", "1.2.9")
    println(app.info())
}