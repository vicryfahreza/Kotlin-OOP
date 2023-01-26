package app

import data.HandPhone
import data.Laptop

fun printName(any: Any){
    if(any is Laptop){
        println("Name Of Laptop is ${any.name}")
    }else if(any is HandPhone){
        println("Name Of HandPhone is ${any.name}")
    }else{
        println(any)
    }
}

fun printObjectWithWhen(any: Any) {
    when (any) {
        is Laptop -> println("Name Of Laptop is ${any.name}")
        is HandPhone -> println("Name Of HandPhone is ${any.name}")
        else -> println(any)
    }
}

fun printWithString(any: Any){
    val value = any as String
    println(value)
}

fun printWithStringSafe(any: Any){
    val value = any as? String
    println(value)
}


fun main(){
    println(printWithString("Vicry"))
//    println(printWithString(1))

    println(printWithStringSafe("Rem"))
    println(printWithStringSafe(1))

    println("Hello")
    println(printName(HandPhone("Nokia")))
    println(printName(Laptop("Asus")))

    println(printObjectWithWhen(Laptop("ROG")))
    println(printObjectWithWhen(HandPhone("Samsung")))
}