package Belajar_SOLID_02_OOP_Inheritance.Java;

interface Ovipar{}

interface Vivipar{}

interface Ovovivipar extends Ovipar,Vivipar{}

class Snake implements Ovovivipar{}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        Snake ular = new Snake();
    }
}
