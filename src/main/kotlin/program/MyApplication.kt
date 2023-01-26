package program

import annotations.Fancy

@Fancy("Vicry")
class MyApplication(val name: String, val version: String) {
    fun info(): String = "Application $name-$version"
}