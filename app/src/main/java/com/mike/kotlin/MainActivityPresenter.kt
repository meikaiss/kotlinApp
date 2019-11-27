package com.mike.kotlin


/**
 * 从某个Activity中查找 此xml布局的view
 */
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 从某个View中查找 此xml布局的view
 */
import kotlinx.android.synthetic.main.activity_main.view.*

/**
 * Created by meikai on 2019/11/27.
 */
class MainActivityPresenter(var activity: MainActivity) {

    init {

    }

    fun refresh() {

        activity.tv_test.text = "测试2"

        activity.window.decorView.tv_test.text = "测试 "
    }

}