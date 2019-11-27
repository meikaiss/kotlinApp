package com.mike.kotlin.mordern

/**
 * Created by meikai on 2019/11/27.
 */
class SingleInstance private constructor(){


    private object Holder { val INSTANCE = SingleInstance() }

    companion object {
        val instance: SingleInstance by lazy { Holder.INSTANCE }
    }

    fun fun1(){

    }



    //演示调用的方式
    fun test1(){
        SingleInstance.instance.fun1()
    }

}