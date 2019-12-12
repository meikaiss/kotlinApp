package com.mike.kotlin.mordern

/**
 *
 *
 * object 关键字是不能有构造参数
 *
 * 1、object 单例对象 声明的初始化过程是线程安全的。
 * 2、对象声明不能在局部作用域（即直接嵌套在函数内部），但是它们可以嵌套到其他对象声明或非内部类中。
 * Created by meikai on 2019/11/27.
 */
object ObjectInstance {

    val personList = mutableListOf<String>()

    fun fun1() {

    }

    //演示调用的方式
    fun test1() {
        ObjectInstance.fun1()
        println(ObjectInstance.personList.size)
    }

}
