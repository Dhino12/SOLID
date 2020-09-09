package Belajar_SOLID_04_OOP_Abstraction.Kotlin

class Circle (val radius:Float): Shape(){

    override fun getArea(): Float {
        return (Math.PI * radius * radius).toFloat()
    }
}