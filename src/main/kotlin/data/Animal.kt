package data

abstract class Animal {
    abstract val name: String
    abstract fun run()
}

class Cat : Animal() {
    override val name: String = "Kucing"
    override fun run() {
        println("$name running From The Dog")
    }
}

class Dog : Animal() {
    override val name: String = "Anjing"

    override fun run() {
        println("$name running From The Hooman")
    }

}