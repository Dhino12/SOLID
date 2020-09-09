package Belajar_SOLID_12_Liskov_Substitution_Principle.Kotlin

import java.util.*

abstract class Product{
    abstract val name:String;

    /*
        FUnction to get all of information about product
     */

    fun getProductInfo(){
        // some magic code
    }
}

abstract class FoodProduct: Product(){
    abstract val expiredDate:Date
}

class Vegetables : FoodProduct(){
    override val name: String
        get() = "Brocoli"

    override val expiredDate: Date
        get() = Date()
}

class SmartPhone : Product(){
    override val name: String
        get() = "Samsung S10+ Limited Edition"

}

