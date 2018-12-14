package com.mike.kotlin.test1

import android.util.Log

/**
 * Created by meikai on 2018/12/14.
 */
class MyObj {

    init {
        Log.e("tag", "MyObj 的 init 执行")
    }

    fun testMyObj(){
        Log.e("tag", "MyObj 的 testMyObj 执行")
    }
}