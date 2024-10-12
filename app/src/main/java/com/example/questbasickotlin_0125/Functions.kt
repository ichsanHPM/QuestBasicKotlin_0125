package com.example.questbasickotlin_0125

fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello, World!")
}

fun withParameter(name: String) {
    println()
    println("== withParameter ==")
    println("Helo, $name!")
}

//named argumen
//named argumen meruakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int){
    println()
    println("==withNamedArgument ==")
    println("Hello, $name! you are $age years old.")
}