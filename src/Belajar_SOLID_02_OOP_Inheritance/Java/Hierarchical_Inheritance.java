package Belajar_SOLID_02_OOP_Inheritance.Java;

// Sama seperti penerapan inheritance pada umumnya,
// jenis ini merupakan sebuah SuperClass yang diwarisi oleh beberapa SubClass

class Hewan{
    public void walk(){
        System.out.println(getClass().getSimpleName() + " walk!");
    }
}

class Carnivora extends Hewan{
    public void eat(){
        System.out.println(getClass().getSimpleName() + " eat!");
    }
}

class Kucing extends Carnivora{}

class Singa extends Carnivora{}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Kucing neko = new Kucing();
        neko.eat();
        neko.walk();
    }
}
