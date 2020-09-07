package Belajar_SOLID_02_OOP_Inheritance.Kotlin

open class Animal{
    open fun walk(){
        println("${javaClass.simpleName} walk!")
    }
}


class Cat:Animal(){
    override fun walk() {
        super.walk()
        println("Yeey ${javaClass.simpleName} walked! ")
    }
}

fun main(){
    val kucing = Cat();
    kucing.walk()
}