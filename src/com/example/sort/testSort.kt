package com.example.sort

import java.lang.Math.abs

/**
 * 版权:上海屋聚 版权所有
 * author: yandeqing
 * version: 3.0.0
 * date:2021/5/20 15:12
 * 备注:
 */
fun main() {
    val shuffled = listOf(5, 4, 2, 1, 3, -10)                   // 1
    val natural = shuffled.sorted()                             // 2
    println(natural)
    val inverted = shuffled.sortedBy { -it }                    // 3
    println(inverted)
    val descending = shuffled.sortedDescending()                // 4
    println(descending)
    val descendingBy = shuffled.sortedByDescending { abs(it) } // 5
    println(descendingBy)
}