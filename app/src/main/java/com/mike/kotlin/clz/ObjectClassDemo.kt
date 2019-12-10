package com.mike.kotlin.clz

/**
 * Created by meikai on 2019/12/10.
 */

open class A1(x: Int) {
    var age = x
}

interface IB {
    fun foo()
}


class Test {

    val t1: A1 = object : A1(10), IB {
        override fun foo() {

        }
    }

    val t2: Any = object : A1(10), IB {
        override fun foo() {

        }
    }

}