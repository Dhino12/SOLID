package Belajar_SOLID_10_Single_Responsiblity_Principle.Kotlin

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class FoodService(
        private var id:String,
        private var name:String,
        private var date:String
){
    fun addToStore(){
        if(!FoodExpiry.isExpired(date)){
            // add to store
        }
    }
}

object FoodExpiry{

    fun isExpired(date:String) :Boolean{
        var foodDate = Date()
        val now = Date()
        val dateFormat = SimpleDateFormat("yyyy-mm-dd",Locale.ENGLISH)

        try {
            foodDate = dateFormat.parse(date)
        }catch (e:ParseException){
            e.printStackTrace()
        }
        return foodDate.time >= now.time
    }
}

// Dengan memisahkannya ke dalam class tersendiri, kita tinggal fokus pada kelas yang
// memiliki tanggung jawabnya. Dengan memisahkannya seperti kode di atas, 
// FoodExpiry dapat digunakan pada kelas lainnya yang membutuhkan tanpa harus bergantung
// pada kelas FoodService seperti pada contoh kode sebelumnya.