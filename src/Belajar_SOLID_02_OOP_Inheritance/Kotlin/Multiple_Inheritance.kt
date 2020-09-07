package Belajar_SOLID_02_OOP_Inheritance.Kotlin

// multiple inheritance
// mengacu pada konsep OOP di mana sebuah class dapat mewarisi
// lebih dari satu SuperClass. Namun perlu diketahui bahwa
// beberapa bahasa pemrograman seperti Java tidak mendukungnya secara penuh,
// dengan alasan suatu SubClass harus bisa mengatur ketergantungan dari 2 (dua) SuperClass-nya.

interface Ovipar

interface Vivipar

interface Ovovivipar : Ovipar,Vivipar

class Snake:Ovovivipar

fun main(){
    val ular = Snake();
}