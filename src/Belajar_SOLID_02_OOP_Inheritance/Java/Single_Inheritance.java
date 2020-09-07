package Belajar_SOLID_02_OOP_Inheritance.Java;

class Animal{
    public void walk(){
        System.out.println(getClass().getSimpleName() + " Walk!.. ");
    }
}

class Cat extends Animal{
    @Override
    public void walk() {
        super.walk();
        System.out.println(getClass().getSimpleName() + " Walked!.....");
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        Cat kucing = new Cat();
        kucing.walk();
    }
}
