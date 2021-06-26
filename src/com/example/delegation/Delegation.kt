package com.example.delegation


// Tom Araya is the "singer" of Slayer
class TomAraya(n: String) : SoundBehavior by ScreamBehavior(n)

// You should know ;)
class ElvisPresley(n: String) : SoundBehavior by RockAndRollBehavior(n)              // 3

fun main() {
    val tomAraya = TomAraya("Thrash Metal")
    tomAraya.makeSound()                                                           // 4
    val elvisPresley = ElvisPresley("Dancin' to the Jailhouse Rock.")
    elvisPresley.makeSound()
}