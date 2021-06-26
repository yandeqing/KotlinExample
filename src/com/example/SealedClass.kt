package com.example


/**
 * 版权:上海屋聚 版权所有
 * author: yandeqing
 * version: 3.0.0
 * date:2021/5/26 11:10
 * 备注:
 */

sealed class Expr{
    data class Const(val number: Double) : Expr()
    data class Sum(val e1: Expr, val e2: Expr) : Expr()
    object NotANumber : Expr()
}



fun eval(expr: Expr): Double = when(expr) {
    is Expr.Const -> expr.number
    is Expr.Sum -> eval(expr.e1) + eval(expr.e2)
    Expr.NotANumber -> Double.NaN
    // 不再需要 `else` 子句，因为我们已经覆盖了所有的情况
}



fun main() {
    val expr = Expr.Const(12.0)
    val expr1 = Expr.Const(12.0)
    val eval = eval(Expr.Sum(expr,expr1))
    val eval1 = eval(Expr.NotANumber)
    println(eval1)
}