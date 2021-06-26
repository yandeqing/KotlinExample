package com.example.collections

import java.util.function.BiConsumer

/**
 * 版权:上海屋聚 版权所有
 * author: yandeqing
 * version: 3.0.0
 * date:2021/5/24 11:43
 * 备注:
 */
data class Person(val name: String, val city: String, val phone: String) // 1

val people = listOf(                                                     // 2
    Person("John", "Boston", "+1-888-123456"),
    Person("Sarah", "Munich", "+49-777-789123"),
    Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
    Person("Vasilisa", "Saint-Petersburg", "+7-999-123456")
)

fun main() {
    val phoneBook = people.associateBy { it.phone }                          // 3
    phoneBook.forEach { t, u -> println("$t->$u") }
    println()
    println()
    val cityBook = people.associateBy(Person::phone, Person::city)           // 4
    cityBook.forEach { t, u -> println("$t->$u") }
    println()
    println()
    val peopleCities = people.groupBy(Person::city, Person::name)            // 5
    peopleCities.forEach { t, u ->
        run {
            u.forEach { i -> println(t + "=>" + i) }
        }
    }
    println()
    println()
    val lastPersonCity = people.associateBy(Person::city, Person::name)      // 6
    lastPersonCity.forEach { t, u -> println("$t->$u") }
}
