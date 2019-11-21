package com.mike.kotlin.basetype

/**
 * 基本数据类型
 * Created by meikai on 2019/11/21.
 */
class BaseType {

    //整数
    fun number() {
        val one = 1 // Int；未超出 Int 最大值的整型值初始化的变量都会推断为 Int 类型
        val threeBillion = 3000000000 // Long ；初始值超过了其最大值，那么推断为 Long 类型
        val oneLong = 1L // Long   ；如需显式指定 Long 型值，请在该值后追加 大写L 后缀。
        val oneByte: Byte = 1
    }

    //小数
    fun decimals() {
        val pi = 3.14 // Double；以小数初始化的变量，编译器会推断为 Double 类型
        val e = 2.7182818284 // Double
        val eFloat = 2.7182818284f // Float，实际值为 2.7182817； 如需将一个值显式指定为 Float 类型，请添加 f 或 F 后缀
        val a = 123.5e10  //Double 科学记数法表示的小数
    }

    fun printDouble(d: Double) {
        print(d)
    }

    //数字的进制
    fun jinzhi(){
        val a = 123  //10进制
        val b = 123L   //10进制
        val c = 0x1f  //16进制
        val d = 0x1011  //二进制
        //注意：不支持八进制
    }

    //数字字面值中的下划线
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    //数字装箱、拆箱
    fun boxTest(){
        val a: Int = 10000
        println(a === a) // 输出“true”
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a

        println(boxedA === anotherBoxedA) // ！！！输出“false”！！！
        println(boxedA == anotherBoxedA) // 输出“true”
    }

    //隐式转换， 较小的类型不能隐式转换为较大的类型
    fun convert(){
        val a: Int? = 1 // 一个装箱的 Int (java.lang.Integer)
        //val b: Long? = a // 此行编译不通过， Required Long?,Find Int?
        //print(b == a) //

        val b: Byte = 1 // OK, 字面值是静态检测的
        //val i: Int = b // 错误 编译不通过
        val i: Int = b.toInt() // OK：显式拓宽来实现转换
        print(i)

        val l = 1L + 3 // Long + Int => Long，算术运算会有重载做适当转换，所以缺乏隐式类型转换很少会引起注意

    }

    /**
     * 方法参数隐式转换 也不支持
     * 例如，具有 Double 参数的函数只能对 Double 值调用，而不能对 Float、 Int 或者其他数字值调用。
     */
    fun testExe() {
        val i = 1
        val d = 1.1
        val f = 1.1f

        printDouble(d)

        //printDouble(i) // 错误：类型不匹配
        //printDouble(f) // 错误：类型不匹配
    }


}