package Belajar_SOLID_06_OOP_Association

class Seller(
    private var id:String,
    private val name:String
)

class User(
        private val id:String,
        private val name:String,
        private val seller:List<Seller> // One To Many Relationship
)