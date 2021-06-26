package com.example

class Greeter(val name: String) {
    fun greet(name1: String) {
        println("Hello, $name $name1")
    }
}


class Customer                                  // 1

class Contact(val id: Int, var email: String)   // 2

fun main() {
    Greeter("World!").greet("12")          // 创建一个对象不用 new 关键字

    val customer = Customer()                   // 3

    val contact = Contact(1, "mary@gmail.com")  // 4

    println(contact.id)                         // 5
    contact.email = "jane@gmail.com"            // 6
}

