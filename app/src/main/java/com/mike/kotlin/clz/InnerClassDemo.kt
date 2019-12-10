package com.mike.kotlin.clz

import android.view.View
import android.widget.Button

/**
 * Created by meikai on 2019/12/10.
 */
class OuterClassDemo {

    private val age = 1

    class InnerClassDemo {

        fun foo() {
            //println(age)  //普通内部类 不能 访问外部类的 变量
            println(0)
        }

    }

}

class OuterClassDemo2 {

    private val age = 1

    inner class InnerClassDemo2 {

        private val sex = 1

        fun foo() {
            println(age)  //inner内部类 不能 访问外部类的 变量
            println(this.sex)
            println(this@OuterClassDemo2.age)
        }

    }

}

//匿名内部类
class Demo {
    fun foo() {

        Button(null).setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // do something
            }
        })

        //单个抽象方法的 Java 接口, 可以使用带接口类型前缀的lambda表达式创建它：
        Button(null).setOnClickListener {
            // do something
        }

        val onClickListener = View.OnClickListener {

        }

    }
}