package com.mike.kotlin.clz

/**
 * Created by meikai on 2019/12/13.
 */
class CompanionObjDemo {

    companion object Instance {

        fun test() {
            println("伴生对象的方法")
        }

    }


    fun foo1() {
        CompanionObjDemo.test()
        val a = CompanionObjDemo.Instance // 取出伴生对象
        a.test()
    }

}


class CompanionObjDemo2 {

    /**
     * 伴生类名可以省略
     */
    companion object {

        fun test() {
            println("伴生对象的方法")
        }

    }


    fun foo1() {
        val a = CompanionObjDemo2.Companion // 省略名称时，以Companion代替类名
        CompanionObjDemo.test()
    }

}


class CompanionObjDemo3 {


    /**
     * callStatic() 在 Java 中是静态的，而 callNonStatic() 不是：
     *
     * C.callStatic(); // 没问题
     * C.callNonStatic(); // 错误：不是一个静态方法
     * C.Companion.callStatic(); // 保留实例方法
     * C.Companion.callNonStatic(); // 唯一的工作方式
     */
    companion object {

        @JvmStatic
        fun callStatic() {
        }

        fun callNonStatic() {}

    }

}