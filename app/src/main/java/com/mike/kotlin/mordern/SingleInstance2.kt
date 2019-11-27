package com.mike.kotlin.mordern

import android.content.Context

/**
 * Created by meikai on 2019/11/27.
 */
class SingleInstance2 private constructor(context: Context) {

    companion object {
        private var instance: SingleInstance2? = null

        fun getInstance(context: Context): SingleInstance2 {
            if (instance == null) {
                synchronized(SingleInstance2::class) {
                    if (instance == null) {
                        instance = SingleInstance2(context)
                    }
                }

            }
            return instance!!
        }
    }

    fun fun1() {
        //正式的业务功能
    }

}


class Demo {

    fun test1(context: Context) {
        SingleInstance2.getInstance(context).fun1()
    }

}



