package com.example.collections.flatmap


fun main() {
    val fruitsBag = listOf("apple", "orange", "banana", "grapes")  // 1
    val clothesBag = listOf("shirts", "pants", "jeans")           // 2
    val cart = listOf(fruitsBag, clothesBag)                    // 3
    println(cart)
    val mapBag = cart.map {
        println(it)
    }
    val flatMapBag = cart.flatMap { it }
    println(flatMapBag)

}