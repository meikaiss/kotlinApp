package com.mike.kotlin.clz

import android.app.Activity

/**
 * Created by meikai on 2019/12/15.
 */

class ClassDemo2 {

    /**
     * out T 等价于 ？extends T
     */
    fun launch(activityClz: Class<out Activity>) {

    }

    /**
     * in T 等价于 ? super T
     */
    fun launch2(activityClz: Class<in Activity>) {

    }

}