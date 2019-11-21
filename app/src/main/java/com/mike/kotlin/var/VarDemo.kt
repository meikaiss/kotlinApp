package com.mike.kotlin.`var`

/**
 * Created by meikai on 2019/11/21.
 */
class VarDemo {

    val a: Int = 1  // 立即赋值
    val b = 2   // 自动推断出 `Int` 类型
    val c: Int = 0  // 类的成员变量中，val只读变量必须在定义时立即赋值

    fun test() {
        val c: Int  // 函数中val定义的局部只读变量，可以延迟到使用前再赋值
        c = 3
        println("value of c is $c")
    }


    var d = 5 //var定义可变变量
    fun test2() {
        d += 1
    }
}