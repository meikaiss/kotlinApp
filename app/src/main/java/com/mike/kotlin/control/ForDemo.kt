package com.mike.kotlin.control

/**
 * Created by meikai on 2019/11/26.
 */
class ForDemo {

    fun forControl() {

        continueLabel@ for (i in 1..1000) {
            if (i % 2 == 0) {
                continue@continueLabel  //偶数跳过本次循环
            }

            //只打印寄数
            println(i)
        }

        breakLabel@ for (i in 1..1000) {
            if (i == 100) {
                break@breakLabel
            } else {
                println(i)
            }
        }

        for (i in 1..1000) {
            if (i == 100) {
                return
            } else {
                println(i)
            }
        }

    }

    fun foreachControl() {

        val intArray = arrayOf(1, 2, 3, 4, 5)
        intArray.forEach continueLabel@{
            if (it % 2 == 0) {
                return@continueLabel  //此处return仅相当于continue，只跳过本次循环，并没有终止循环
            }
            println(it)
        }

        intArray.forEach {
            if (it % 2 == 0) {
                return@forEach  //跳过本次循环，隐式写法
            }
            println(it)
        }

        run Break@{
            intArray.forEach Continue@{
                if (it >= 3) {
                    return@Break  //终止 foreach 循环
                }
                println(it)
            }
        }

    }

}