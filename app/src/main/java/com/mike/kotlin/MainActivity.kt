package com.mike.kotlin

import LoginModelNoPkg
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mike.kotlin.pkg.LoginModel
import com.mike.kotlin.modelNewPkg.LoginModelNewPkg
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var model: LoginModel = LoginModel()
        var modelNewPkg: LoginModelNewPkg = LoginModelNewPkg()
        var modelNoPkg: LoginModelNoPkg = LoginModelNoPkg()


        tv_test.text = "测试"
    }


}


