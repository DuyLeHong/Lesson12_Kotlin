package com.example.lesson12_kotlin

fun main() {                        // 2
    println("Hello, CodeFresher!")        // 3

    var a: String = "initial"  // 1 String a = "initial"

    a = "Lesson 12 - P1";

    println(a)

    val b = 1             // 2
    val c = 3                  // 3

//    b = 2
//    c = 5

    // null safety:
    var neverNull: String? = "This can't be null"            // 1

    //neverNull = null                                        // 2

    var nullable: String? = null     // 3

    nullable = "Gia tri gi do"                                         // 4

    var inferredNonNull = "The compiler assumes non-null"   // 5


    doDaicuaChuoi(neverNull)                                     // 8
    doDaicuaChuoi(nullable)
}

fun doDaicuaChuoi(notNull: String?): Int {                   // 7
    //

//    if (notNull == null)
//        return 0;

    println("Do dai cua chuoi '$notNull' la: ${notNull!!.length}")

    return notNull.length!!
}

