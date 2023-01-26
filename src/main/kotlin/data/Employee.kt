package data

open class Employee(val name: String) {
    open fun sayHello(name: String){
        println("Hello $name, My name is ${this.name}")
    }
}

open class Manager(name: String) : Employee(name) {
     final override fun sayHello(name: String) {
        println("Hello $name, My name is Manager ${this.name}")
    }

}

class SuperManager(name: String) : Manager(name){
    // ERROR karena fungsi override parent di set final
//    override fun sayHello(name: String) {
//        println("Hello $name, My name is SuperManager ${this.name}")
//    }
}

class VicePresident(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, My name is VicePresident ${this.name}")
    }
}