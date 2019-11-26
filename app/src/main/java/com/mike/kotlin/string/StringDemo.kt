package com.mike.kotlin.string

/**
 * Created by meikai on 2019/11/21.
 */
class StringDemo {

    fun access() {
        val str = "meikai hello"
        for (c in str) {
            println(c)
        }

        val char = str[1]

        val str2 = "meikai" + 1
        //val str3 =    1 + "meikai"  //编译报错，必须第一项是 字符串
    }

    /**
     * 字符串字面值
     */
    fun surfaceValue() {

        /**
         * 1.转义字符串:原始字符串可以包含换行以及任意文本
         */
        val s1 = "Hello world\n"

        /**
         * 2.原始字符串:使用三个引号（"""）分界符括起来, 内部没有转义并且可以包含换行以及任何其他字符:
         */
        val s2 = """
            val s1 = "Hello world"
            |I am kotliner
            |Are you ok?
            |s1的长度=${s1.length}
            |显示美元符$9.99
            |显示美元符${'$'}9.99
        """.trimMargin()
        //trimMargin() 函数去除前导空格
        //默认 | 用作边界前缀，但你可以选择其他字符并作为参数传入，比如 trimMargin(">")
    }

    /**
     * 字符串模板表达式
     */
    fun express() {
        var a = 1
        // 模板中的简单表达式：
        val s1 = "a is $a"

        a = 2
        // 模板中的任意表达式：
        val s2 = "${s1.replace("is", "was")}, but now is $a"

        val s = "abc"
        println("$s.length is ${s.length}") // 输出“abc.length is 3”

    }


}