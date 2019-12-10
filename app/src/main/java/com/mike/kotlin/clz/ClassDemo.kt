package com.mike.kotlin.clz

/**
 * Created by meikai on 2019/11/28.
 */
class ClassDemo {

    fun test1() {

        //对应 java 中的 类名.class
        ClassDemo::class.java

    }

}

/**
 * 一个类可以有一个主构造函数以及一个或多个次构造函数。主构造函数是类头的一部分
 * 在 JVM 上，如果主构造函数的所有的参数都有默认值，编译器会生成 一个额外的无参构造函数，它将使用默认值
 */
class Person constructor(firstName: String)

class Person2 private constructor(firstName: String)

//如果主构造函数没有任何注解或者可见性修饰符，可以省略这个 constructor 关键字。
class Person3(firstName: String)

/**
 * 主构造函数不能包含任何的代码。初始化的代码可以放到以 init 关键字作为前缀的初始化块（initializer blocks）中。
 * 在实例初始化期间，初始化块按照它们出现在类体中的顺序执行，与属性初始化器交织在一起：
 */
class Person4(firstName: String) {

    var name: String = firstName  //主构造的参数可以在初始化块中使用。它们也可以在类体内声明的属性初始化器中使用：

    init {
        //主构造的参数可以在初始化块中使用。它们也可以在类体内声明的属性初始化器中使用：
        name = firstName
    }

    var age: Int

    /**
     * 语法上允许多个init，多个时执行顺序从前到后
     */
    init {
        age = 0
    }

}

class Person5(val firstName: String, val lastName: String, var age: Int)

class Person6 {
    var childrenList = mutableListOf<Person>()

    constructor(parent: Person) {
        childrenList.add(parent)
    }
}

class Person7(val name: String) { //若类有主构造函数，则所有次构造必须调用到主构造函数

    var childrenList = mutableListOf<Person7>()

    constructor(name: String, parent: Person) : this(name) {
        childrenList.add(this)
    }

}


/**
 * 请注意，初始化块中的代码实际上会成为主构造函数的一部分。委托给主构造函数会作为次构造函数的第一条语句，因此所有初始化块中的代码都会在次构造函数体之前执行。即使该类没有主构造函数，这种委托仍会隐式发生，并且仍会执行初始化块：
 */
class Constructors {
    init {
        println("这一句先执行")
    }

    constructor(i: Int) {
        println("这一句后执行 $i")
    }
}

/**
 * 如果一个非抽象类没有声明任何（主或次）构造函数，它会有一个生成的不带参数的主构造函数。构造函数的可见性是 public。如果你不希望你的类有一个公有构造函数，你需要声明一个带有非默认可见性的空的主构造函数：
 */
class DontCreateMe private constructor ()