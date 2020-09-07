package Belajar_SOLID_04_OOP_Abstraction.Kotlin

class Triangle( val base:Float, val height:Float) : Shape(){

    override fun getArea(): Float {
        return 0.5f * base * height
    }

}
