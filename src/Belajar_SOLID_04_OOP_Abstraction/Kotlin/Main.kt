package Belajar_SOLID_04_OOP_Abstraction.Kotlin

fun main(){
    val lingkaran = Circle(20f)
    val segitiga = Triangle(5f,10f);

    println("Luas Segitiga ${segitiga.getArea()}")
    println("Luas Lingkaran ${lingkaran.getArea()}")
}