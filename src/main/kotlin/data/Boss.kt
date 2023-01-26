package data

class Boss(val name: String) {
    inner class Employee(val name: String){
        fun hi(){
            println("Hi My Name is $name And My Boss is ${this@Boss.name}")
        }
    }
}