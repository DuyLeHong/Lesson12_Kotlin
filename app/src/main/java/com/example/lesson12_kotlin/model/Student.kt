package com.example.lesson12_kotlin.model

class Student(var sName: String, var age: Int, var sClass: String, var isK56: Boolean) {

    override fun toString(): String {
        return "Student(sName='$sName', age=$age, sClass='$sClass', isK56=$isK56)"
    }

}