package com.mike.kotlin.basetype

/**
 * Created by meikai on 2019/11/26.
 */
class ArrayDemo {

    val intArr = arrayOf(1, 2, 3)  //创建数组[1,2,3]
    val nullArr = arrayOfNulls<String>(16)  //创建长度为16，但各项都为null的 String数组

    val nameArr = Array(5) { i -> (i * i).toString() }  //创建 int 数组  ["0", "1", "4", "9", "16"]


    /**
     * 原生类型数组:无装箱开销的专门的类来表示原生类型数组
     * ByteArray、 ShortArray、IntArray 等等。这些类与 Array 并没有继承关系，但是它们有同样的方法属性集。它们也都有相应的工厂方法:
     */

    val intArray: IntArray = intArrayOf(1, 2, 3)
    val arr = IntArray(5)  // 大小为 5、值为 [0, 0, 0, 0, 0] 的整型数组

    // 例如：用常量初始化数组中的值
    val arr2 = IntArray(5) { 42 }  // 大小为 5、值为 [42, 42, 42, 42, 42] 的整型数组

    // 例如：使用 lambda 表达式初始化数组中的值
    var arr3 = IntArray(5) { it * 1 }   // 大小为 5、值为 [0, 1, 2, 3, 4] 的整型数组（值初始化为其索引值）


}