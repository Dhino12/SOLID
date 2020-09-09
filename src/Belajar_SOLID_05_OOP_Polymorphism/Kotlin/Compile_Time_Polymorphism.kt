package Belajar_SOLID_05_OOP_Polymorphism.Kotlin

class Arithmetic{
    fun add(valueA:Int, valueB:Int) = valueA + valueB
    fun add(valueA:Float, valueB:Float) = valueA + valueB
    fun add(valueA: Double, valueB: Float) = valueA + valueB
}

fun main(){
    val hitungInt = Arithmetic();
    hitungInt.add(1,2)
}