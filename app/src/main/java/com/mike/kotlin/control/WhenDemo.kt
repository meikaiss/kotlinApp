package com.mike.kotlin.control

/**
 * Created by meikai on 2019/11/26.
 */
class WhenDemo {

    /**
     * 用法一
     * when（x）
     * case 常量或表达式
     * case 区间
     * case is类型判断
     *
     * 用法二
     * val x=1
     * when{
     *
     * }
     *
     */

    fun when1() {

        val a = 100 % 3

        val b = when (a) {
            1 -> {
                100
            }
            2 -> {
                100
            }
            else -> {
                //如果 when 作为一个表达式使用，则必须有 else 分支， 除非编译器能够检测出所有的可能情况都已经覆盖了
                100L
            }
        }

        val c = when (a) {
            1, 2, 3 -> {

            }
            in 4..100 -> {

            }
//            a % 2 == 0 ->{     //case 的类型必须相同，不能上面的case同int比较，下面的case同boolean比较
//
//            }
            testPos(a) -> {  //case的可能是与 表达式的值 相比较

            }
            else -> {

            }
        }
    }

    fun testPos(a: Int): Int {
        return if (a > 0) {
            1
        } else if (a < 0) {
            -1
        } else {
            0
        }
    }

    /**
     * when
     * case 区间
     */
    fun when2() {

        var a = 100
        when (a) {
            in 0..1000 -> {

            }
            !in 1001..2000 -> {

            }
            in 2001..3000 step 2 -> {

            }
            in 0 downTo -1000 -> {

            }
            in 0 downTo -1000 step -2 -> {

            }
        }
    }

    /**
     * when
     * case is类型判断
     */
    fun when3() {

        var a: Any? = "meikai"

        a = 123


        when (a) {
            is Int -> {

            }
            is String -> {

            }
        }

    }

    fun when4() {
        var x = 100
        when {
            x > 0 -> {

            }
            x < 0 -> {

            }
            else -> {

            }
        }
    }

}