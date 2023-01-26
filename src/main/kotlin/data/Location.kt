package data

abstract class Location(val locate: String)

class City(locate: String): Location(locate)

class Country(locate: String): Location(locate)


