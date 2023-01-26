package app

import data.City
import data.Country
import data.Location

fun main(){
    //val location = Location("Snowfield")
    val city = City("Japos")
    val country = Country("Tarakarta")

    println(city.locate)
    println(country.locate)
}