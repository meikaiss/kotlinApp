package com.mike.kotlin.string

/**
 *
 *
 * Created by meikai on 2019/11/21.
 */
class CharDemo {

    /**
     * 字符用 Char 类型表示。它们不能直接当作数字
     */
    fun test(){
        var a:Char = 'A'
        var b:Char = 'b'
        var c:Char = '3'
        //var d:Char = '31'  //报错，只能是单个字符

        /**
         * 字符字面值用单引号括起来: '1'。 特殊字符可以用反斜杠转义。
         * 支持这几个转义序列：\t、 \b、\n、\r、\'、\"、\\ 与 \$。
         * 编码其他字符要用 Unicode 转义序列语法：'\uFF00'
         */


        var cInt = 'c'.toInt()   //字符显式转换为数字
        var specialChar = '\''   //单引号字符
        var unicodeChar = '\uFF00'   //单引号字符

        if (c !in '0'..'9'){
            print(c)
        }

    }

}