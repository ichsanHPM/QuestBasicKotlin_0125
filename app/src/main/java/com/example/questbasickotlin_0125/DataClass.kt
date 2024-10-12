package com.example.questbasickotlin_0125

//Data class
//Data class adalah class yang digunakan untuk menyimpan data
//Data class menyediakan fungsi untuk meng-override fungsi equals(), hashcode(), dan toString()
//Data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan

data class DataClass(
    val id: Int,
    var email: String
)

fun main() {
    val data = DataClass(1, "indra@gmail.com")
    println(data)

    //fungsi equals
    val data2 = DataClass(1, "makan@gmail.com")
    println(data == data2) //false


