package com.example

class MutableStack<E>(vararg items: E) {              // 1

  private val elements = items.toMutableList()

  fun push(element: E) = elements.add(element)        // 2

  fun peek(): E = elements.last()                     // 3

  fun pop(): E = elements.removeAt(elements.size - 1)

  fun isEmpty() = elements.isEmpty()

  fun size() = elements.size

  override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
  val stack = MutableStack(Dog(), "3.14", "3")
  println(stack)
}