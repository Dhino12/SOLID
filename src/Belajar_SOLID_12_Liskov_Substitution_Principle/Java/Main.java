package Belajar_SOLID_12_Liskov_Substitution_Principle.Java;

import java.util.Date;

abstract class Product{
    abstract String setName();

    public void getProductInfo(){
        // some magic code
    }
}

abstract class FoodProduct extends Product{
    abstract Date setExpiredDate();
}

class Vegetables extends FoodProduct{

    @Override
    String setName() {
        return "Brocoli";
    }

    @Override
    Date setExpiredDate() {
        return new Date();
    }
}

class Smartphone extends Product{

    @Override
    String setName() {
        return "Samsung S10+ Limited Edition";
    }

    // Fungsi ini tidak relevan karena Smartphone tidak memiliki expiredDate
    // @Override
    // Date setExpiredDate() {
    // return new Date();
    // }
}

// Untuk menjadikan sebuah kelas benar
// benar menjadi SubClass, kelas tersebut tidak hanya wajib untuk menerapkan
// fungsi dan properti dari SuperClass, melainkan juga harus memiliki perilaku
// yang sama dengan SuperClass-nya. Untuk mencapainya, terdapat beberapa aturan yang harus dipatuhi.
// - Contravariant dan Covariant
// - preconditions dan postconditions
// - Invariant
// - Constraint