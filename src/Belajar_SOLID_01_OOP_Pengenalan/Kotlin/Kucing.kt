package Belajar_SOLID_01_OOP_Pengenalan.Kotlin

data class Kucing(
        // Property
        var color:String = "",
        var height:Double = 0.0,
        var length:Double = 0.0,
        var weight: Double = 0.0
){
    // ====== Function / Behaviour ========
    fun purring() = "Meoww....."

    fun eat(){
        weight++
    }
}

fun main(){
    val persian = Kucing();
    persian.color = "Putih"
    persian.height = 24.0
    persian.length = 46.0
    persian.weight = 2.0

    val bengal = Kucing("Cokelat",22.0,39.0,2.3)
    val anggora = Kucing("Abu-abu",25.0,41.0,2.4)

    println("Kucing Anggora Warna: " + anggora.color )
    println("Kucing Anggora Berat: " + anggora.height )
    println("Kucing Anggora Suara: " + anggora.purring() )
}