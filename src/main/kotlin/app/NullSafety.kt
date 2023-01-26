package app

data class Friend(val name: String)

fun sayHello(friend: Friend?) {
//    if(friend != null){
//        println("Hello ${friend?.name}")
//    }
//    println("hello ${friend?.name}")

//    val name = friend?.name ?: "Friend"
//    println("Hello $name")

//    val name = friend!!.name
//    println("Hello $name")
}

fun main() {
    sayHello(Friend("Vicry"))
    sayHello(null)
}