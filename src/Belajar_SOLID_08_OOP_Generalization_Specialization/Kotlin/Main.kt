package Belajar_SOLID_08_OOP_Generalization_Specialization.Kotlin

abstract class Product(
    private val id:String,
    private var name:String,
    private var price:String
)

class ElectronicProduct(
        private var id:String,
        private var name:String,
        private var price: String,
        private var productDate: String
):Product(id,name,price)

class ConsumableProduct(
        private var id:String,
        private var name:String,
        private var price: String,
        private var expirationDate:String
):Product(id, name, price)