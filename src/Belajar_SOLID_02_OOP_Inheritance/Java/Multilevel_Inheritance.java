package Belajar_SOLID_02_OOP_Inheritance.Java;

class Animals{
    public void walk(){
        System.out.println(getClass().getSimpleName() + " walk! ");
    }
}

class Carnivore extends Animals{
    public void eat(){
        System.out.println(getClass().getSimpleName() + " eat! ");
    }
}

class Cats extends Carnivore{}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Cats kucing = new Cats();
        kucing.eat();
        kucing.walk();
    }
}


