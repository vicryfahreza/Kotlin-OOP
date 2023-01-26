package app

import data.Student

fun main() {
    val student = Student("Vicry", 20)

    val result1: String = student.let {
        "Hello My Name ${it.name} Now I'm ${it.age} "
    }
    println(result1)

    val result2: String = student.run {
        "Hello My Name ${this.name} Now I'm ${this.age} "
    }
    println(result2)

    val result3: Student = student.apply {
        "Hello My Name ${this.name} Now I'm ${this.age} "
    }
    println(result3)

    val result4: Student = student.also {
        "Hello My Name ${it.name} Now I'm ${it.age} "
    }
    println(result4)

    val result5 = with(student) {
        "Hello My Name ${this.name} Now I'm ${this.age} "
    }
    println(result5)
}