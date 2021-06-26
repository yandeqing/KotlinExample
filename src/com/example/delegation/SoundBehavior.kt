package com.example.delegation

interface SoundBehavior {                                                          // 1
    fun makeSound()
}

abstract class abstractBehavior : SoundBehavior {                                                          // 1
}

open class Behavior() : abstractBehavior() {
    override fun makeSound() {
        TODO("Not yet implemented")
    }

}

fun main() {
    var soud = object : Behavior() {
        fun makeOtherSound() {
            println("Not yet implemented makeOtherSound")
        }
    }
    soud.makeOtherSound()
}