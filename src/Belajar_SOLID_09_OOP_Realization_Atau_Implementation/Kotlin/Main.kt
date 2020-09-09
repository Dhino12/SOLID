package Belajar_SOLID_09_OOP_Realization_Atau_Implementation.Kotlin

interface ProductService{
    fun getProduct(id:String)
    fun calculateProductPrice()
}

class ProductServiceImpl() : ProductService{
    override fun getProduct(id: String) {
        TODO("Not yet implemented")
    }

    override fun calculateProductPrice() {
        TODO("Not yet implemented")
    }

}

// Hubungan realisasi atau implementasi adalah hubungan abstraksi
// khusus antara dua kelas, satu mewakili kelas yang
// direalisasikan (supplier) dan yang lainnya mewakili kelas implementasinya (client).
// Realisasi dapat digunakan dalam beberapa hal seperti untuk menyempurnakan sebuah
// kelas, optimasi, transformasi, template, model sintesis, komposisi kerangka kerja, dll.
// Interface realization adalah hubungan realisasi khusus antara classifier dan interface

//    Pada contoh kode diatas kelas ProductServiceImpl merupakan kelas classifier yang
//    mengimplementasikan kontrak dari kelas interface-nya yaitu kelas ProductService. 