package Belajar_SOLID_06_OOP_Association.Association_01_Aggregation

class Shop(
    private val id:String,
    private val name:String
){
    var seller : Seller
    set(value) {
        seller = value
    }
    get(){
        return seller
    }
}

class Seller(
        private val id:String,
        private val name:String
)

// perbedaan dengan bentuk hubungan komposisi
// adalah bentuk hubungan ini tidak terikat, yang berarti setiap class dapat
// berdiri sendiri. contoh meskipun kelas Shop
// dihancurkan, class Seller masih dapat digunakan. Tapi tidak sebaliknya.