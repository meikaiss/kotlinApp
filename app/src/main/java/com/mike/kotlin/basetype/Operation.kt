package com.mike.kotlin.basetype

/**
 * Created by meikai on 2019/11/21.
 */
class Operation {


    /**
     *
     * 完整的位运算列表（只用于 Int 与 Long）：
     *  shl(bits) – 有符号左移
     *  shr(bits) – 有符号右移
     *  ushr(bits) – 无符号右移
     *  and(bits) – 位与
     *  or(bits) – 位或
     *  xor(bits) – 位异或
     *  inv() – 位非
     */
    fun bitOpe() {
        val x = 1 shl 1   //左移1位，即乘2
        val b = 1L shl 2   //左移2位，即乘4

    }

}