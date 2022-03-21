package com.example.lesson12_kotlin

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)        // 1
val sudoers: MutableList<Int> = systemUsers                              // 2

fun addSystemUser(newUser: Int) {                                 // 3
    systemUsers.add(newUser)
}


fun main() {
    addSystemUser(6)                                              // 5
    println("Tot sudoers: ${sudoers.size}")               // 6

    sudoers.add(7)
    sudoers.add(0, -1)
//    sudoers.forEach {                                     // 7
//            i -> println("Some useful info on user $i")
//    }

//    for (item in sudoers) {
//        println("Some useful info on user $item")
//    }

//    for (var i:Int = 0; i < sudoers.size; i++) {
//        println("Some useful info on user ${sudoers.get(i)}")
//    }

    for (i in sudoers.indices) {
        println("Some useful info on user index $i : ${sudoers.get(i)}")
    }



}