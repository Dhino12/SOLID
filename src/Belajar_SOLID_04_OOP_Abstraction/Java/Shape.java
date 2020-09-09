package Belajar_SOLID_04_OOP_Abstraction.Java;

import Belajar_SOLID_03_OOP_Encapsulation.Java.Restoran;

// Menyatakan Bahwa class ini adalah class abstract
public abstract class Shape {
    String color;

    void setColor(String color){
        this.color = color;
    }

    String getColor(){
        return this.color;
    }

    // Abstract method
    abstract float getArea();
}
