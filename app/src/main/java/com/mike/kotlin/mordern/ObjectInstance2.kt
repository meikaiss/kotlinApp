package com.mike.kotlin.mordern

import android.view.View

/**
 *
 * 1、object 对象声明可以有超类型
 * 2、对象声明不能在局部作用域（即直接嵌套在函数内部），但是它们可以嵌套到其他对象声明或非内部类中
 * Created by meikai on 2019/12/10.
 */
object ObjectInstance2 : View.OnClickListener{

    override fun onClick(v: View?) {

    }

}