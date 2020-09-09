package Belajar_SOLID_06_OOP_Association.Association_02_Composition

// Komposisi = sebuah hubungan dapat dikatakan komposisi jika sebuah class memiliki class lainnya
// Aturan yang berlaku untuk hubungan ini adalah ketika kelas yang “memiliki” class
// lainnya dihancurkan maka class yang “dimiliki” oleh kelas tersebut akan hancur juga atau tidak dapat digunakan.

class User(
        private val id:String,
        private val name:String,
        private val address:Address
)

class Address(
        private val id:String,
        private val location:String
)

fun main(){
    val user = User(id = "1234",name = "Chino",address = Address("123","Yogyakarta"))
}

// Sebuah class User memiliki bentuk hubungan komposisi dengan
// class Address yang ditandai dengan adanya anak panah dengan ujung 
// diamond hitam penuh, yang mengarah pada class yang “memiliki” objek tersebut.
// Ketika class User hancur, maka class Address yang memiliki hubungan dengan
// class User tersebut akan ikut hancur dan tidak bisa digunakan lagi.