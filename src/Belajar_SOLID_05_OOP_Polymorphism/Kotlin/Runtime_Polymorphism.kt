package Belajar_SOLID_05_OOP_Polymorphism.Kotlin

open class Animal{
    open fun walk(){
        println("${javaClass.simpleName} walk")
    }
}

class Cat:Animal(){
    // Fungsi dipanggil saat runtime contoh override
    override fun walk() {
        super.walk()
        println("Yeyy.. ${javaClass.simpleName} walked...!")
    }
}

fun main(){
    val cat = Cat()
    cat.walk()
}