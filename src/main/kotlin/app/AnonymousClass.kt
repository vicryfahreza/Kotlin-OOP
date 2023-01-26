package app

import data.Action

fun fireAction(action: Action){
    action.action()
}

class SampleAction: Action{
    override fun action() {
        println("Action Sample without Anonymous Class")
    }
}


fun main(){
    fireAction(SampleAction())
    fireAction(object : Action{
        override fun action() = println("Action One")})
    fireAction(object : Action{
        override fun action() = println("Action Two")})
}
