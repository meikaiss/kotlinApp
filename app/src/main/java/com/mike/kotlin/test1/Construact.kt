package com.mike.kotlin.test1

import android.util.Log

/**
 * Created by meikai on 2018/12/14.
 */
class Construact {

    init {
        Log.e("tag", "Construact 的 init 执行")
    }

    var myObj = MyObj()


    fun testConstruact() {
        Log.e("tag", "Construact 的 testConstruact 执行")
    }

    /**
     *
     * 12-14 14:07:33.298 17755-17755/com.mike.kotlin E/tag: Construact 的 init 执行
    12-14 14:07:33.299 17755-17755/com.mike.kotlin E/tag: MyObj 的 init 执行
    12-14 14:07:33.299 17755-17755/com.mike.kotlin E/tag: Construact 的 testConstruact 执行

    init与成员变量的初始化 的 顺序  ，是按 代码的书写顺序来的
     */

}