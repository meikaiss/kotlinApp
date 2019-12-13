package com.mike.kotlin.`fun`

/**
 * Created by meikai on 2019/11/21.
 */

class FunDemo {

    //普通函数
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    //表达式函数， 不允许以表达式来重载
    fun sum2(a: Int, b: Int) = a + b

    //函数返回无意义的值：
    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }

    //Unit 返回类型可以省略：
    fun printSum2(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }


    fun foo(bar: Int = 0, baz: Int = 1, qux: () -> Unit) { /*……*/ }

    fun demo(){
        foo(1) { println("hello") }     // 使用默认值 baz = 1
        foo(qux = { println("hello") }) // 使用两个默认值 bar = 0 与 baz = 1
        foo { println("hello") }        // 使用两个默认值 bar = 0 与 baz = 1
    }
}