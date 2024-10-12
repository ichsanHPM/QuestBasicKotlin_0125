package com.example.questbasickotlin_0125

//List adalah kumpulan data yang disusun secara berurutan dari
//List bersifat ordered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
//List bersifat mutable dan red only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
//List Read-Only menggunakan listogf
//List Mutable menggunakan mutablelistof

fun ContohList() {
    println("=== List ===")
    //List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    //Menghapus data dari List Mutable
    shape.remove("Triangle")
    println(shape)

    //Mengubah data di dalam List Mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}