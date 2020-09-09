package Belajar_SOLID_14_Dependency_Inversion_Principle.Kotlin

import javax.xml.crypto.Data

class PaymentService(val database:Database){

    fun paymentIsValid(){

    }

    fun openDatabase(){

    }

    fun addNewPayment(){

    }

    fun removePaymentById(){

    }

    fun updatePaymentById(){

    }
}

abstract class Database{
    abstract fun insert()
    abstract fun update()
    abstract fun delete()
}

class MySQLDatabase : Database(){
    override fun insert() {
        TODO("Not yet implemented")
    }

    override fun update() {
        TODO("Not yet implemented")
    }

    override fun delete() {
        TODO("Not yet implemented")
    }
}

class MongoDatabase : Database(){
    override fun insert() {
        TODO("Not yet implemented")
    }

    override fun update() {
        TODO("Not yet implemented")
    }

    override fun delete() {
        TODO("Not yet implemented")
    }

}