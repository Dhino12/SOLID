package Belajar_SOLID_07_OOP_Dependency

// Hubungan dependensi diartikan sebagai hubungan antara dua buah class,
// di mana satu class memiliki ketergantungan dengan class lainnya tetapi
// class lainnya tidak/mungkin memiliki ketergantungan terhadap class pertama tadi.
class ShopService{
    fun changeProductPrice(price:String, product:Product){
        product.changePrice(price)
    }
}

class Product(
        private var id:String,
        private var name:String,
        private var price: String
){
    fun changePrice(value: String){
        this.price = value
    }
}