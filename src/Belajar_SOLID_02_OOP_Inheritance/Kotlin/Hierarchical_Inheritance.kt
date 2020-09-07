package Belajar_SOLID_02_OOP_Inheritance.Kotlin

//Sama seperti penerapan inheritance pada umumnya, jenis ini merupakan sebuah SuperClass yang diwarisi oleh beberapa SubClass
open class Hewan{
    fun walk(){
        println("${javaClass.simpleName} walk! ")
    }
}

open class Carnivora:Hewan(){
    fun eat(){
        println("${javaClass.simpleName} eat!")
    }
}
open class Herbivora:Hewan(){
    fun eat(){
        println("${javaClass.simpleName} eat!")
    }
}

class Kucing:Carnivora()

class Singa:Carnivora()

class Sapi:Herbivora()

fun main(){
    val kucing = Kucing()
    kucing.eat()
    kucing.walk()

    val singa = Singa()
    singa.eat()
    singa.walk()
}