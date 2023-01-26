package data

class Person{
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String){
        println("Hello $name, My name is $firstName")
    }

    fun sayHello(firstName: String, lastName: String){
        println("Hello $firstName $lastName, My name is ${this.firstName}")
    }

    fun getRun(){
        println("Run From Me!!")
    }

    fun getFullName(){
        println("$firstName $middleName $lastName")
    }
}