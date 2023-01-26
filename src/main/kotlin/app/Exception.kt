package app

import exception.ValidationException
import exception.ValidationNullException

fun validateAndSayHello(name: String?){
    if(name.isNullOrBlank()){
        throw ValidationNullException("Name is Blank Or Null")
    }
    if(name == "Anjing"){
        throw ValidationException("Name Cannot Be Anjing!! ANJING!!")
    }
    println("Hello $name")
}


fun main() {
    try {
        validateAndSayHello("Vicry")
//        validateAndSayHello("Anjing")
//        validateAndSayHello("")
        validateAndSayHello(null)
    } catch (error: ValidationException){
        println("Error Occured: ${error.message}")
    } catch(error: ValidationNullException){
        println("Error Occured: ${error.message}")
    } finally {
        println("Finally Finished")
    }
}