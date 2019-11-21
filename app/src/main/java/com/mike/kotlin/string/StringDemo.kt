package com.mike.kotlin.string

/**
 * Created by meikai on 2019/11/21.
 */
class StringDemo {

    fun test(){
        var a = 1
        // 模板中的简单表达式：
        val s1 = "a is $a"

        a = 2
        // 模板中的任意表达式：
        val s2 = "${s1.replace("is", "was")}, but now is $a"
    }



}