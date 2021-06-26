package com.example

/**
 * 版权:上海屋聚 版权所有
 * author: yandeqing
 * version: 3.0.0
 * date:2021/5/25 14:00
 * 备注:
 */

fun testLet(updateApps: MutableList<Int>?) {
    updateApps?.let {
        if (!updateApps.isEmpty()) {
            println("!updateApps.isEmpty(testLet)")
        } else {
            println("updateApps.isEmpty(testLet)")
        }
    }?:println("testLet updateApps is null")
}

fun testWith(updateApps: MutableList<Int>?) {
    with(updateApps) {
        if (!this!!.isEmpty()) {
            println("!updateApps.isEmpty(testWith)")
        } else {
            println("updateApps.isEmpty(testWith)")
        }
    }
}

fun testRun(updateApps: MutableList<Int>?) {
    return updateApps?.run {
        if (!isEmpty()) {
            println("!updateApps.isEmpty(testRun)")
        } else {
            println("updateApps.isEmpty(testRun)")
        }
    } ?: println("testRun updateApps is null")
}

fun testApply(updateApps: MutableList<Int>?): MutableList<Int>?{
    val apply = updateApps?.apply {
        if (!isEmpty()) {
            println("!updateApps.isEmpty(testRun)")
        } else {
            println("updateApps.isEmpty(testRun)")
        }
    }
    return apply
}


fun main() {
    val updateApps: MutableList<Int>? = mutableListOf(1)
    testLet(null)
    testWith(updateApps)
    val testRun = testRun(updateApps)
    println("testRun updateApps is $testRun")
    val testApply1 = testApply(updateApps)
    println("testApply updateApps is $testApply1")
}