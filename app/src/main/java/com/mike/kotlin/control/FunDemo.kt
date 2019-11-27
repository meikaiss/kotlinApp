package com.mike.kotlin.control

/**
 * Created by meikai on 2019/11/27.
 */
class FunDemo {

    //定义一个函数变量，此变量表示一个无入参且无返回的函数
    var logFun: (() -> Unit)? = null

    //定义时立即 构造
    var logFun2: (() -> Unit) = {
        print("haha")
    }

    //先定义，再赋值
    var addFun: ((Int) -> Int)? = null

    fun test1() {
        addFun = { it ->
            it * 10
        }
    }

    var add100Fun: ((Int) -> Int)? = {
        it + 100
    }

    var addDoubleFun: ((Int, Int) -> Int)? = { a, b ->
        print("haha")
        100 + a + b
    }

    // 函数当作入参
    fun fun1(name: String, moreClick: () -> Unit) {
        println(name)

        //调用方式一:
        moreClick.invoke()

        //调用方式二:
        moreClick()
    }

}