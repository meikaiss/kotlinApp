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

class OnlyObject {

    fun foo() {
        val person = object {
            var name = "meikai"
            var age = 30
        }

        println(person.name)
        println(person.age)
    }

}

/**
 * 1、匿名对象可以用作只在本地和私有作用域中声明的类型
 * 2、如果你使用匿名对象作为公有函数的返回类型或者用作公有属性的类型，那么该函数或属性的实际类型会是匿名对象声明的超类型；
 * 3、如果你没有声明任何超类型，就会是 Any
 */
class Domain {

    // 私有函数，所以其返回类型是匿名对象类型
    private fun foo() = object {
        val x: String = "x"
    }

    // 公有函数，所以其返回类型是 Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x        // 没问题。心得：在私有域下，编译器能通过上下文找到匿名类对象
        //val x2 = publicFoo().x  // 错误：未能解析的引用“x”
    }

}

