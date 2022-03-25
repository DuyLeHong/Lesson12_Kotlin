package com.example.lesson12_kotlin

object AppUtils {                                                 //1

    fun takeParams(username: String, password: String) {        //2
        println("input Auth parameters = $username:$password")
    }

    val KEY_NAME = "KEY_NAME"

    fun doSomething() {        //2
        println("Do something - like static function in Java")
    }


}