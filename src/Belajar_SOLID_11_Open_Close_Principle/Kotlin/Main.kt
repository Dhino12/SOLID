package Belajar_SOLID_11_Open_Close_Principle.Kotlin

class Product{
    //    Product Entitas
}

class ShippingOrderService{
    fun checkout(product: Product, shipping: Shipping){
        val costShipping = shipping.calculateProduct(product)
        /* code to do check */
    }
}

abstract class Shipping{
    abstract fun calculateProduct(product: Product):Int
}

class JNEShipping:Shipping(){
    override fun calculateProduct(product: Product): Int {
        TODO("Not yet implemented")
        // return  calculate amount of this type with product
    }
}

class TIKIShipping:Shipping(){
    override fun calculateProduct(product: Product): Int {
        TODO("Not yet implemented")
        // return  calculate amount of this type with product
    }
}

// Penambahan class baru tanpa mengubah kode di ShippingOrederService
class POSINDOShipping:Shipping(){
    override fun calculateProduct(product: Product): Int {
        TODO("Not yet implemented")
        // return  calculate amount of this type with product
    }
}

// Saat menerapkan open/close principle ke dalam project, kita bisa membatasi kebutuhan untuk mengubah
// kode yang telah ditulis, diuji dan di-debug. Tujuannya untuk menghindari resiko atau
// kelemahan sistem yang bisa saja terjadi. Selain itu, kita bisa menghindari ketergantungan
// dan meningkatkan fleksibilitas sistem. Tentunya ini akan meringankan proses skalabilitas
// dari sisi pengembangan perangkat lunak.
