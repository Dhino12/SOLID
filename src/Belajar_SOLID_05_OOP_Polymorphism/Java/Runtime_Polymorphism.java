package Belajar_SOLID_05_OOP_Polymorphism.Java;

class Animal{
    public void walk(){
        System.out.println(getClass().getSimpleName() + " walk");
    }
}

class Cat extends Animal{
    @Override
    public void walk() {
        super.walk();
        System.out.println(getClass().getSimpleName() + " walked...!");
    }
}

public class Runtime_Polymorphism {
    public static void main(String[] args) {
        Cat kucing = new Cat();
        kucing.walk();
    }
}
