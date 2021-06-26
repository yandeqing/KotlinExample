package com.example

fun printMessage(message: String): Unit {                               // 1
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}

fun multiply(x: Int, y: Int) = x * y                                    // 4

//函数再次封装
fun test(x: Int, y: Int) = multiply(x, y)

fun <E> sum(vararg sa: E): E? {                                          // 3
    for (item in sa) {
        println("vararg=$item")
        return item
    }
    return null
}

fun main() {
    printMessage("Hello")                                               // 5                    
    printMessageWithPrefix("Hello", "Log")                              // 6
    printMessageWithPrefix("Hello")                                     // 7
    printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
    println(sum(1, 2))                                                  // 9
    println(multiply(2, 4))                                             // 10
    println(sum(4))                                             // 10
}