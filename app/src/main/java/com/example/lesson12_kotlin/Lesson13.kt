package com.example.lesson12_kotlin

import com.example.lesson12_kotlin.model.Student

fun main() {
    val upperCase1: (String, Int) -> String = { str: String , number : Int -> str.uppercase() + number.toString() } // 1

    val upperCase2: (String) -> String = { str -> str.uppercase() }         // 2

    val upperCase3 = { str: String -> str.uppercase() }                     // 3

     //val upperCase4 = { str : Int -> str.uppercase() }                          // 4

    val upperCase5: (Student) -> String = { it.sName }                 // 5

    val upperCase6: (Student) -> Int = Student::age                  // 6

    println(upperCase1("hello codefresher - lesson", 13))
    println(upperCase2("hello"))
    println(upperCase3("hello"))

    var student = Student("Nguyen Van Long", 20, "", false)
    println(upperCase5(student))
    println(upperCase6(student))

    val keyName : String = AppUtils.KEY_NAME

    AppUtils.takeParams(keyName, keyName)

    AppUtils.doSomething()

    println(Student.COMMON_MESS)

    Student.showCommonInfo()

}

