package data

interface Interaction {
    val name: String
    fun sayHello(name: String){
        println("Hello My Name Is $name, Hello from ${this.name}")
    }
}

interface Go : Interaction{
    fun go(){
        println("Go!")
    }
}

interface MoveA {
    fun move(){
        println("Move A")
    }
}

interface MoveB {
    fun move(){
        println("Move B")
    }
}


class Human(override val name: String) : Go, MoveA, MoveB {
    override fun move() {
        println("Move Human!!")
        super<MoveA>.move()
        super<MoveB>.move()
    }
}