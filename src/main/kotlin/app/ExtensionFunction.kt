package app

import data.Student
import data.sayHello
import data.upperName

fun main(){
    val student: Student? = Student("Misaki", 16)
    student.sayHello("Misaka")

    println(student?.upperName)
}