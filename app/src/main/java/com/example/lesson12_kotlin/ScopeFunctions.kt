package com.example.lesson12_kotlin

import com.example.lesson12_kotlin.model.Student

fun customPrint(s: String) {
    print(s.uppercase())
}

fun main() {
    val empty = "CodeFresher".let {               // 1
        customPrint(it)                    // 2
        it.isEmpty()                       // 3
    }

    val number: Int = 1
    number.let {

    }
    number.run {

    }
    number.apply {

    }
    number.also {

    }

    println(" is empty: $empty")


    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {                         // 4
            print("\t")
            customPrint(it)
            println()
        }
    }

    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        strOne?.let {

            firstString ->  strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }

            customPrint("$firstString")


        }
    }

    printNonNull("mess gi do")
    printNonNull("my string")

    printIfBothNonNull("first", null)

    println ()
    println ("---------Run----------")

    //run
    fun getStudenInfo(student: Student?) {

        val studentAge = student?.run {                                                   // 1
            println(student.toString())

            student.age

            //1
        }

        println(studentAge)
    }

    getStudenInfo(null)

    val myStudent = Student("Nguyen Manh Hung", 20, "", false)
    getStudenInfo(myStudent)

    println ()
    println ("---------With----------")

    with(myStudent) {
        val _sName  = sName
        println("$sName:$age")
    }

    println ()
    println ("---------Apply----------")
    myStudent.apply {
        sName = "Nguyen Van Hung"
        age = 21
        sClass = "CNTT1"
    }

    println(myStudent)

    println ()
    println ("---------also----------")
    myStudent.also {
        println(it.toString())
    }

}


class Configuration(var host: String, var port: Int)