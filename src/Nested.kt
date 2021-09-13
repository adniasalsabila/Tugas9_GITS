//nestedClass
class Outer {
    class Nested {
        fun pesan() = "Hello, Adnia"
    }
}

//innerClass
class Outer2 {
    val messageInner: String = "Semangat!"

    inner class Nested {
        fun callMessage() = messageInner
    }
}

fun main(args: Array<String>) {
    val nested = Outer.Nested().pesan()
    println(nested)

    val inner = Outer2().Nested().callMessage()
    print(inner)
}