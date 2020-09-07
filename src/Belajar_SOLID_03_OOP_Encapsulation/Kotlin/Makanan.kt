package Belajar_SOLID_03_OOP_Encapsulation.Kotlin

fun main(){
    val data = Restoran();
    data.harga = 18000.0
    data.menu = "Ice Cream"
    data.spesial = true;

    println("Menu Makanan = " + data.menu)
    println("Harga Makanan = " + data.harga)
    println("Menu Spesial = " + data.spesial)
}