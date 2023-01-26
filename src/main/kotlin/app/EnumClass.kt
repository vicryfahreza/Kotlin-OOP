package app

import data.Gender

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val allGender: Array<Gender> = Gender.values()

    val manStringOfValue = Gender.valueOf("MALE")
    val womanStringOfValue = Gender.valueOf("FEMALE")

    println(man)
    println(woman)
    println(allGender.toList())
}