

fun printMessage(message: String) {     //void                          // 1
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
    println("{$prefix} $message")
}

fun tinhTong2So(x: Int, y: Int): Int {                                            // 3
    return x + y
}

fun nhan2So(x: Int, y: Int) = x * y                                     // 4

fun nhan2So_Cach2(x: Int, y: Int) :Int {
    val ketqua = x * y;
    return ketqua;
}

fun main() {
    printMessage("Hello") // 5

    printMessageWithPrefix("Hello", "Log")                              // 6
    printMessageWithPrefix("Hello")                                     // 7
    printMessageWithPrefix(message = "Hello" , prefix = "Log")           // 8
    printMessageWithPrefix(prefix = "Log", message = "Noi dung gi do")

    println("Tong 2 so 1 va 2 la: ${tinhTong2So(1, 2)}")                                                  // 9
    println("Tich 2 so 2 va 4 la: ${nhan2So_Cach2(2, 4)}")                                             // 10


    printAll("Hello", "Hallo", "Salut", "Hola", "你好", "Xin chao")                 // 2


    println("-------------When example-------------")

    inRaGiaTri("Hello")
    inRaGiaTri(1)
    inRaGiaTri(0L)
    inRaGiaTri(MyClass())
    inRaGiaTri("hello")
}

fun inRaGiaTriString(obj: String) {
    when (obj) {                                     // 1
        "1" -> {
            println("One")
            println("Two")
            println("Three")
            println("Four")
        }                          // 2
        "Hello" -> {
            println("Greeting")
        }               // 3
        else -> {
            println("Unknown")
        }                   // 6
    }
}

fun inRaGiaTri(obj: Any) {
    when (obj) {                                     // 1
        1 -> {
            println("One")
            println("Two")
            println("Three")
            println("Four")
        }                          // 2
        "Hello" -> {
            println("Greeting")
        }               // 3
        is Long -> {
            println("Long")
        }                   // 4
        !is String -> {
            println("Not a string")
        }        // 5
        else -> {
            println("Unknown")
        }                   // 6
    }
}

class MyClass {

}

fun printAll(vararg messages: String) {                            // 1
    for (m in messages)
        println(m)
}