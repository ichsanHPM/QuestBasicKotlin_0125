package com.example.questbasickotlin_0125

//Lamda Functions
//Lamda Functions adalah fungsi yang tidak memiliki nama
//Lamda Functions biasanya digunakan untuk membuat fungsi yang sederhana
//Lamda Functions menggunakan tanda panah (->) untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String): String {
    return string.uppercase()
}

//dapat ditulis dalam ekspresi lamda sebagai berikut
fun main() {
    uppercaseString("hello")
    println({string: String -> string.uppercase() } ("hello"))
    //Hello
}