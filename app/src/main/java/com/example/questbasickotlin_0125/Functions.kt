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

//default parameter value
//default parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi
fun withDefaultParameter(name: String = "Indra", age: Int) {
    println()
    println("== withDefaultParameter ==")
    println("Hello, $name! you are $age years old.")
}

fun withReturn(panjang : Int, lebar : Int) : Int {
    return println(panjang * lebar)
}

fun main() {
    withoutParameter()
    withParameter("John")
    withNamedArgument(name = "John", age = 30)
    withDefaultParameter(age = 25)
}