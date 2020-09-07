package Belajar_SOLID_02_OOP_Inheritance.Kotlin

open class Animals{
    fun walk(){
        println("${javaClass.simpleName} walk!")
    }
}

open class Carnivore:Animals(){
    fun eat(){
        println("${javaClass.simpleName} eat")
    }
}

class Cats:Carnivore()

fun main(){
    val kucing = Cats();
    kucing.eat();
    kucing.walk()
}